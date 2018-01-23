'use strict';

angular.module('sbAdminApp')

 .controller('CashOutCtrl', ['$scope','$stateParams','$filter','modalService','cashOutService','accountService',
            function($scope ,$filter ,$stateParams , modalService ,cashOutService,accountService)
            {
                        $scope.cashOut = {
                                "walletNo":"","accountId":"","amount":"","comments":""
                        }


                        $scope.searchAccount = function() {

                                accountService.getResources().
                                get( { walletNo:$scope.cashOut.walletNo}).
                                $promise.then(
                                                 function(response) {
                                                     $scope.accountWalletInfo = response;
                                                     $scope.accountWalletInfo.fullName = response.firstName + " "+ response.midName + " " +  response.familyName;
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

                        $scope.saveCashOut = function() {

                            $scope.cashOut.accountId = $scope.accountWalletInfo.accountId;

                            console.log($scope.cashOut);

                            cashOutService.getResources().save({} ,$scope.cashOut ,

                                                 function(response) {
                                                     $scope.cashOut = {};
                                                     $scope.accountWalletInfo = {};
                                                     modalService.showModal({},
                                                                     {
                                                                        headerText: 'Confirmation',
                                                                        bodyText:'Withdraw Information has been saved successfully',
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


            }
 ]);