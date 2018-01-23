'use strict';

angular.module('sbAdminApp')

 .controller('LoginCtrl', [ '$scope','$cookies','$state','user','token',

             function( $scope , $cookies ,  $state , user ,token)
            {
                     if($cookies.get('x-auth-token')){

                            console.log('cookie value :: ' + $cookies.get('x-auth-token'));

                            user.getResources().get(
                                    function(response) {
                                        console.log('response data :: ' + response.authenticated );

                                        if(response.authenticated)
                                            $state.go('main.home');

                                    },
                                    function(response) {
                                        $state.go('main.home');

                                    }
                            );

                     }

                     $scope.login = function(){

//                             console.log('LOGIN :: ' + $scope.credentials.username +'  :: '+ $scope.credentials.password);

                             $scope.headers = $scope.credentials ? {
                                        authorization : "Basic "
                                                + btoa($scope.credentials.username + ":" + $scope.credentials.password)
                             } : {};


                            token.getResources($scope.headers).get(

                                function(response) {

                                                     console.log('login response');
                                                     console.log(response.data);
                                                     $cookies.put('x-auth-token', response.headers['x-auth-token']);

                                                     console.log('cookie value :: ' + $cookies.get('x-auth-token'));

                                                     console.log('cookies scope token :: ' + $cookies.get('x-auth-token'));
                                                     $state.go('main.home');

                                },
                                function(response) {

                                                     console.log('error');
                                                     console.log(response.status);
                                                     if(response.status === 401){
//                                                            $state.go('login');
                                                     }

                                }
                            );
                    }
            }
 ]);