<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
   $(function() {
      $('#b1').click(function() {
         $.ajax({
            type: 'POST',
            beforeSend : function(xhr){
                  //KakaoAK 뒷부분(rest api 넣는 곳)
                  xhr.setRequestHeader("Authorization", "KakaoAK c3dd47be1e2e33e66cf7dcdd1db16d2f");
                  xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
              },
            //Kakao developer 제공하는 API url 주소
            url: "https://dapi.kakao.com/v2/vision/product/detect",
            data: {
            	//이미지 주소
               image_url: "https://developers.kakao.com/docs/latest/ko/assets/style/images/vision/vision_product.png"
            },
            success: function(x) {
            	alert('kakao연결 성공.!!! ' + x.result.objects[0].class)
            	for (var i = 0; i < x.result.objects.length; i++) {
						console.log(x.result.objects.length)
						console.log('kakao연결 성공.!!! ' + x.result.objects[i].class)
					}
            	//each문 사용하기 위해선 배열에 넣어줘야 한다.
            	list = x.result.objects 
            	//items명의 배열 생성
            	items = []
            	$(list).each(function(index, pro) {
            		//items배열에 list의 class 값들을 넣어줌
					items.push(pro.class)
            	})
					console.log(items)
            } //success
         }) //ajax
      })//b1
   })//$fun
</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
</body>
</html>