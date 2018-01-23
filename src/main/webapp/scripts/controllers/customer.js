'use strict';

angular.module('sbAdminApp')

 .controller('CustomerCtrl', ['$scope','$state','$filter','$location', 'modalService' , 'countryService','identityTypeService','customerService',
                              'operationCountryService','operationCountryAreaService',
                              'operationCountryAreaCititesService', 'currencyService',

            function($scope ,$state , $filter , $location, modalService, countryService , identityTypeService ,customerService ,operationCountryService ,
                             operationCountryAreaService , operationCountryAreaCititesService , currencyService)
            {

                        $scope.newcustomer = {
                                "nationality":"","identityTypeId":"","identityIssuerCountry":"","identityNumber":"",
                                "firstName":"","midName":"","familyName":"","motherMaidenName":"","gender":"",
                                "countryId":"","areaId":"","cityId":"","postalCode":"","address":"","email":"","mobileNumber":"",
                                "advirtisingFlag":false,"notificationFlag":false,"newsFlag":false,
                                "identityExpirationDate":"",
                                "identityIssuanceDate" :"",
                                "wallets": [
                                        {
                                         "currencyId":"",
                                         "mobileNumber":""
                                        }
                                ]
                        }

                        countryService.getResources().get(

                                             function(response) {
                                                 $scope.countries = response.countries;
                                             },
                                             function(response) {
                                                 $scope.message = response.statusText;
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

                        operationCountryService.getResources().get(

                                             function(response) {
                                                 $scope.operationsCountries = response.operationsCountries;
                                             },
                                             function(response) {
                                                 $scope.message = response.statusText;
                                             }
                        );

                        $scope.operationCountryChange = function() {

                                operationCountryAreaService.getResources().get({ocid:$scope.newcustomer.countryId}).$promise.then(

                                             function(response) {
                                                 $scope.operationCountryAreas = response.areas;
                                             },
                                             function(response) {
                                                 $scope.message = response.statusText;
                                             }
                                );
                        };

                        $scope.operationCountryAreaChange = function() {

                                operationCountryAreaCititesService.getResources().
                                get( { ocid:$scope.newcustomer.countryId , aid: $scope.newcustomer.areaId}).
                                $promise.then(

                                                 function(response) {
                                                     $scope.operationCountryAreaCities = response.cities;
                                                 },

                                                 function(response) {
                                                     $scope.message = response.statusText;
                                                 }
                                );
                        };

                        currencyService.getResources().get(

                                             function(response) {
                                                 $scope.currencies = response.currencies;
                                             },
                                             function(response) {
                                                 $scope.message = response.statusText;
                                             }
                        );


                        $scope.saveCustomer = function() {


                                        console.log('customer data :: ' + $scope.newcustomer );
                                         customerService.getResources().save({} ,$scope.newcustomer ,


                                                 function(response) {

                                                     modalService.showModal({},
                                                                     {
                                                                        headerText: 'Confirmation',
                                                                        bodyText:'Customer Account Created Successfully',
                                                                        loginIdText:'Customer Login ID :' + response.loginId,
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


                        $scope.cashIn = function() {


                             customerService.getResources().save({} ,$scope.newcustomer ,


                                                 function(response) {

                                                     modalService.showModal({},
                                                                     {
                                                                        headerText: 'Confirmation',
                                                                        bodyText:'Customer Account Created Successfully',
                                                                        loginIdText:'Customer Login ID :' + response.loginId,
                                                                        walletNo:'Wallet No. :' + response.wallets[0].code,
                                                                        loginPwText :'Password :' + response.password,
                                                                        pinText:'Pin Code :' + response.wallets[0].pin
                                                                     }
                                                     )
                                                     .then(function (){
                                                          $state.go('main.cashin',{ walletNo:response.wallets[0].code });
                                                     });
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