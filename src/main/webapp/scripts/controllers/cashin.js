'use strict';

angular.module('sbAdminApp')

 .controller('CashInCtrl', ['$scope','$stateParams','$filter', 'modalService','countryService','identityTypeService','cashInService','accountService',
            function($scope , $stateParams , $filter, modalService , countryService , identityTypeService ,cashInService,accountService)
            {


                        $scope.cashIn = {
                                "walletNo":"","accountId":"","amount":"","name":"","identityTypeId":"","identityNo":"","comments":"",
                                "identityIssuerCountry":"",  "identityIssuanceDate": new Date(),"identityExpirationDate": new Date()
                        }


                        countryService.getResources().get(

                                             function(response) {
                                                 $scope.countries = response.countries;
                                             },
                                             function(response) {
                                                 $scope.message = "Error: "+response.status + " " + response.statusText;
                                             }
                        );

                        identityTypeService.getResources().get(

                                                             function(response) {
                                                                 $scope.identityTypes = response.identityTypes;
                                                             },
                                                             function(response) {
                                                                 $scope.message = response.statusText;
                                                             }
                        );

                        $scope.clear = function() {

                                                     $scope.cashIn.name = "";
                                                     $scope.cashIn.identityTypeId = "";
                                                     $scope.cashIn.identityIssuerCountry = "";
                                                     $scope.cashIn.identityNo = "";
                                                     $scope.cashIn.identityIssuanceDate =  "";
                                                     $scope.cashIn.identityExpirationDate =  "";
                        }

                        $scope.searchAccount = function() {


                                $scope.clear();
                                accountService.getResources().
                                get( { walletNo:$scope.cashIn.walletNo}).
                                $promise.then(
                                                 function(response) {

                                                     $scope.accountWalletInfo = response;
                                                     $scope.accountWalletInfo.fullName = response.firstName + " "+ response.midName + " " +  response.familyName;
                                                     $scope.cashIn.name = response.firstName + " "+ response.midName + " " +  response.familyName;
                                                     $scope.cashIn.identityTypeId = response.identityTypeId;
                                                     $scope.cashIn.identityIssuerCountry = response.identityIssuerCountry;
                                                     $scope.cashIn.identityNo = response.identityNumber;
                                                     $scope.cashIn.identityIssuanceDate =  $filter('date')(response.identityIssuanceDate, "yyyy-MM-dd");
                                                     $scope.cashIn.identityExpirationDate =  $filter('date')(response.identityExpirationDate, "yyyy-MM-dd");

                                                 },
                                                 function(response) {

                                                     $scope.accountWalletInfo = {};
                                                     modalService.showModal({},
                                                                     {
                                                                        headerText: 'Error',
                                                                        bodyText:response.data.statusText


                                                                     }
                                                     );
                                                 }
                                );
                        };

                        $scope.saveCashIn = function() {

                            $scope.cashIn.accountId = $scope.accountWalletInfo.accountId;
                            cashInService.getResources().save({} ,$scope.cashIn ,

                                                 function(response) {

                                                     $scope.cashIn = {};
                                                     $scope.accountWalletInfo = {};
                                                     modalService.showModal({},
                                                                     {
                                                                        headerText: 'Confirmation',
                                                                        bodyText:'Deposit Information has been saved successful',
                                                                        currentBalance: 'Current Balance: '+ response.currentBalance

                                                                     }
                                                     );
                                                 },
                                                 function(response) {
                                                     modalService.showModal({},
                                                                     {
                                                                        headerText: 'Error',
                                                                        bodyText:response.data.statusText

                                                                     }
                                                     );
                                                 }
                            );
                        };



                        if($stateParams.walletNo != ''){
                                $scope.cashIn.walletNo = $stateParams.walletNo ;
                                $scope.searchAccount();
                        }
            }
 ]);