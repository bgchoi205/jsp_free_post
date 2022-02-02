<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <!-- 공통 css 불러오기 -->
    <link rel="stylesheet" href="/css/common.css">

    <!-- 폰트어썸 불러오기 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- 테일윈드 불러오기 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.9/tailwind.min.css">

    <!-- 제이쿼리 불러오기 -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <!-- 반응형 메타태그 -->
    <meta name="viewport" content="width=device-width,initial-scale=1">

    <!-- materialize 불러오기 -->
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

    <meta charset="UTF-8">
    <title>Home</title>
</head>

<body>

    <header class="common-header shadow-lg">
      <div class="container">
        Fish Recommend
      </div>
    </header>
    <div class="container mx-auto min-h-screen flex flex-col">
      <div class="common-back flex-grow">
        <h5>기능 테스트</h5>
        <hr>
        <p class="p-2">
          <a href="/new" class="waves-effect waves-light btn-small">save</a>
        </p>
        <p class="p-2">
          <a href="#" class="waves-effect waves-light btn-small">list</a>
        </p>
      </div>
    </div>

</body>
</html>