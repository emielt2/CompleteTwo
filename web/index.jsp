<%--
  Created by IntelliJ IDEA.
  User: E
  Date: 19/11/2017
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
  <%--<head>--%>
    <%--<title>$Title$</title>--%>
  <%--</head>--%>
  <%--<body>--%>
  <%--$END$--%>
  <%--</body>--%>
<%--</html>--%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>AJAX with Servlets using AngularJS</title>
  <script type="text/javascript" src="http://code.angularjs.org/angular-0.10.6.js"></script>

  <%--<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>--%>

  <script>
      var app = angular.module('myApp', []);

      function MyController($scope, $http) {

          $scope.getDataFromServer = function() {
              $http({
                  method : 'GET',
                  url : 'HelloWorld'
              }).success(function(data, status, headers, config) {
                  $scope.person = data;
                  $scope.names = [
                      {name:'Jani',country:'Norway',city:'Duckstad1'},
                      {name:'Hege',country:'Sweden',city:'Duckstad2'},
                      {name:'Kai',country:'Denmark',city:'Duckstad3'}

                  ];
                  console.log("ai ai");
              }).error(function(data, status, headers, config) {
                  $scope.names = [
                      {name:'Jani',country:'Norway',city:'Duckstad1'},
                      {name:'Hege',country:'Sweden',city:'Duckstad2'},
                      {name:'Kai',country:'Denmark',city:'Duckstad3'},
                      {name:newstring(),country:'Denmark',city:'Duckstad4'}
                  ];
                  //console.log("ai ai");
                  // called asynchronously if an error occurs
                  // or server returns response with an error status.
              });

          };
      };
  </script>
</head>
<body>
<div ng-app="myApp">
  <div ng-controller="MyController">
    <button ng-click="getDataFromServer()">Fetch data from server</button>
    <ul>
      <li ng-repeat="x in names">
        {{ x.name + ', ' + x.country+ ', ' + x.city }}
      </li>
    </ul>
    <p>First Name : {{person.firstName}}</p>
    <p>Last Name : {{person.lastName}}</p>
    <p>{{1+5}}</p>
  </div>
</div>
</body>
</html>