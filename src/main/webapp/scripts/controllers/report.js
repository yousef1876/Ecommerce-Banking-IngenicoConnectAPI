'use strict';

angular.module('sbAdminApp')

 .controller('ReportCtrl', ['$scope','$filter',  'modalService','transactionService',
            function($scope ,$filter,modalService, transactionService)
            {
                        $scope.searchTrans = { }


                         console.log('Reports ');

                        $scope.searchTransactions = function() {

                                $scope.transactions = {};

                                transactionService.getResources().
                                get( {
                                        "type": $scope.searchTrans.type ,
                                        "walletNo" : $scope.searchTrans.walletNo ,
                                        "fromDate": $filter('date')( $scope.searchTrans.fromDate  ),
                                        "toDate": $filter('date')( $scope.searchTrans.toDate  )
                                     }
                                ).
                                $promise.then(
                                                 function(response) {
                                                     $scope.transactions = response.transactions;
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