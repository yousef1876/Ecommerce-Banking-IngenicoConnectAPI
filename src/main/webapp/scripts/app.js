'use strict';


angular.module('sbAdminApp', [
       'oc.lazyLoad',
       'ui.router',
       'ngResource',
       'ui.bootstrap',
       'angular-loading-bar',
       'ngCookies',
       'datatables',

])


.filter('iif', function () {
   return function(input, trueValue, falseValue) {
        return input ? trueValue : falseValue;
   };
})
.config(['$stateProvider','$urlRouterProvider','$ocLazyLoadProvider',



    function ($stateProvider,$urlRouterProvider,$ocLazyLoadProvider) {

      $ocLazyLoadProvider.config({
        debug:false,
        events:true,
      });

      $urlRouterProvider.otherwise('/main/home');

      $stateProvider

      .state('main', {
            controller  : 'UserCtrl',
            url:'/main',
            templateUrl: 'main.html',

      })

      .state('main.home',{
              templateUrl:'home.html',
              url:'/home'
      })


      .state('main.newcustomer',{
              templateUrl:'views/newcustomer.html',
              controller  : 'CustomerCtrl',
              url:'/newcustomer'
      })

      .state('main.newmerchant',{
              templateUrl:'views/newmerchant.html',
              controller  : 'MerchantCtrl',
              url:'/newmerchant'
      })

      .state('main.cashin',{
                    templateUrl:'views/cashin.html',
                    controller  : 'CashInCtrl',
                    url:'/cashin/{walletNo}'
      })

      .state('main.cashout',{
                    templateUrl:'views/cashout.html',
                    controller  : 'CashOutCtrl',
                    url:'/cashout'
      })


      .state('main.report',{
                    templateUrl:'views/report.html',
                    controller  : 'ReportCtrl',
                    url:'/report'
      })

      .state('login', {
            controller  : 'LoginCtrl',
            url:'/login',
            templateUrl: 'login.html',

      })
    }
]);


