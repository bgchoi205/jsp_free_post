<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Save</title>

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

</head>

<body>
<header class="common-header shadow-lg">
  <div class="container">
    Fish Recommend
  </div>
</header>
<div class="container mx-auto min-h-screen flex flex-col">
  <div class="common-back flex-grow">
    <div class="input-back">
      <form action="/" method="post">
        <div class="input-textbox">
          <span>이름</span>
          <input type="text" name="name">
        </div>
        <div class="input-textbox">
          <span>계절</span>
          <div class="select-season">
            <label>
              <input type="radio" name="season" value="SPRING">
              <span>봄</span>
            </label>
            <label>
              <input type="radio" name="season" value="SUMMER">
              <span>여름</span>
            </label>
            <label>
              <input type="radio" name="season" value="FALL">
              <span>가을</span>
            </label>
            <label>
              <input type="radio" name="season" value="WINTER">
              <span>겨울</span>
            </label>
          </div>
        </div>
        <div class="input-textbox">
          <span>서식</span>
          <div class="select-habitats">
            <label>
              <input type="checkbox" name="habitats" value="EASTSEA">
              <span>동해</span>
            </label>
            <label>
              <input type="checkbox" name="habitats" value="SOUTHSEA">
              <span>남해</span>
            </label>
            <label>
              <input type="checkbox" name="habitats" value="WESTSEA">
              <span>서해</span>
            </label>
          </div>
        </div>
        <div class="input-textbox">
          <span>용도</span>
          <div class="select-cooking-styles">
            <label>
              <input type="checkbox" name="cookingStyles" value="GRILL">
              <span>구이</span>
            </label>
            <label>
              <input type="checkbox" name="cookingStyles" value="SASHIMI">
              <span>회</span>
            </label>
            <label>
              <input type="checkbox" name="cookingStyles" value="SOUP">
              <span>탕</span>
            </label>
            <label>
              <input type="checkbox" name="cookingStyles" value="BLANCH">
              <span>데침</span>
            </label>
          </div>
        </div>
        <div class="input-textbox">
          <span>설명</span>
          <textarea name="description" id="description" cols="30" rows="20" ></textarea>
        </div>
        <div class="submit-btn">
          <button class="btn waves-effect waves-light" type="submit" name="action">추가
          </button>
        </div>
      </form>
    </div>
  </div>
</div>

</body>
</html>