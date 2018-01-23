'use strict';

angular.module('sbAdminApp')

                .constant("baseURL","/rest/")

                .service('token', ['$resource', 'baseURL', function($resource,baseURL) {

                                   this.getResources = function(header){

                                       return $resource(baseURL+"token/:id" ,null,  {
                                            get: {
                                                    headers:header,
                                                    method: 'GET',
                                                    transformResponse: function(data, headers){

                                                        var response = {}
                                                        response.data = data;
                                                        response.headers = headers();
                                                        return response;
                                                    },
                                            },

                                            update:{method:'PUT' }
                                       });
                                   };
                }])

                .service('user', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"user/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('countryService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"country/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('identityTypeService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"identitytype/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('operationCountryService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"operationcountry/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('operationCountryAreaService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"operationcountry/:ocid/areas" ,null,  {

                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('operationCountryAreaCititesService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"operationcountry/:ocid/areas/:aid/cities" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('currencyService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"currency/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])


                .service('customerService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"customer/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('industryService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"industry/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('merchantService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"merchant/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])


                .service('cashInService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"transaction/cashIn/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('cashOutService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"transaction/cashOut/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('accountService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"account/info?walletNo=:walletNo" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

                .service('transactionService', ['$resource', '$cookies', 'baseURL', function($resource,$cookies ,baseURL) {

                               this.getResources = function(header){

                                   return $resource(baseURL+"transaction/:id" ,null,  {
                                        get: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'GET'
                                        },
                                        save: {
                                                headers:{'x-auth-token':$cookies.get('x-auth-token')},
                                                method: 'POST'
                                        },
                                        update:{method:'PUT' }
                                   });
                               };
                }])

;
