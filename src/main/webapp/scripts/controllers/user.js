'use strict';

angular.module('sbAdminApp')

.controller('UserCtrl', ['$cookies','$scope','$state','user','token',


             function($cookies, $scope , $state , user ,token)
             {

//                     console.log('user controller');

                     if($cookies.get('x-auth-token')){
                            user.getResources().get(

                                    function(response) {

                                        console.log('response data :: ' + response.authenticated );

                                        if( ! response.authenticated)
                                            $state.go('login');

                                    },
                                    function(response) {
                                         if( ! response.authenticated)
                                                $state.go('login');
                                    }
                            );

                     }
                     else{
                          $state.go('login');
                     }
             }
]);