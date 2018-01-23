'use strict';

angular.module('sbAdminApp')

 .controller('MerchantCtrl', ['$scope','$filter', 'modalService','industryService','merchantService',
                              'operationCountryService','operationCountryAreaService',
                              'operationCountryAreaCititesService', 'currencyService',

            function($scope ,$filter,modalService, industryService , merchantService ,operationCountryService ,
                             operationCountryAreaService , operationCountryAreaCititesService , currencyService)
            {

                        $scope.newMerchant = {
                                "industryId":"","brandName":"",
                                "firstName":"","midName":"","lastName":"","mobileNumber":"","email":"",
                                "homePhone":"",
                                "countryId":"","areaId":"","cityId":"","postalCode":"","address":"",
                                "contactFirstName":"","contactMidName":"","contactLastName":"","contactPositon":"",
                                "contactEmail":"","contactMobile":"","contactBusineesPhone":"","contactBusineesFax":"",
                                "wallets": [
                                        {
                                         "currencyId":"",
                                         "mobileNumber":""
                                        }
                                ]
                        }

                        industryService.getResources().get(

                               function(response) {
                                     $scope.industries = response.industries;
                               },
                               function(response) {
                                     $scope.message = "Error: "+response.status + " " + response.statusText;
                               }
                        );

                        operationCountryService.getResources().get(

                                             function(response) {
                                                 $scope.operationsCountries = response.operationsCountries;
                                             },
                                             function(response) {
                                                 $scope.message = "Error: "+response.status + " " + response.statusText;
                                             }
                        );

                        $scope.operationCountryChange = function() {

                                operationCountryAreaService.getResources().get({ocid:$scope.newMerchant.countryId}).$promise.then(

                                             function(response) {
                                                 $scope.operationCountryAreas = response.areas;
                                             },
                                             function(response) {
                                                 $scope.message = "Error: "+response.status + " " + response.statusText;
                                             }
                                );
                        };

                        $scope.operationCountryAreaChange = function() {

                                operationCountryAreaCititesService.getResources().
                                get( { ocid:$scope.newMerchant.countryId , aid: $scope.newMerchant.areaId}).
                                $promise.then(

                                                 function(response) {
                                                     $scope.operationCountryAreaCities = response.cities;
                                                 },

                                                 function(response) {
                                                     $scope.message = "Error: "+response.status + " " + response.statusText;
                                                 }
                                );
                        };

                        currencyService.getResources().get(

                                             function(response) {
                                                 $scope.currencies = response.currencies;
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


                        $scope.saveMerchant = function() {

                            merchantService.getResources().save({} ,$scope.newMerchant ,

                                                 function(response) {
                                                     modalService.showModal({},
                                                                     {
                                                                        headerText: 'Confirmation',
                                                                        bodyText:'Merchant Account Created Successfully',
                                                                        loginIdText:'Merchant Login ID :' + response.loginId,
                                                                        walletNo:'Wallet No. :' + response.wallets[0].code,
                                                                        loginPwText :'Password :' + response.password,
                                                                        pinText:'Pin Code :' + response.wallets[0].pin
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