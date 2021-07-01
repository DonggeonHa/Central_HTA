<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<title>Bootstrap 5 Example</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="container">
			<h1>HTML DOM 조작하기</h1>
			<p>텍스트 컨텐츠, HTML 컨텐츠, 폼의 입력값, 엘리먼트의 프로퍼티 값 조회하기</p>
			
			<div id="box-1">
				<h3>.text(), .html()로 텍스트 컨텐츠, html 컨텐츠 조회하기</h3>
				<p>jQuery 연습하기</p>
				<p><strong>jQuery</strong> 연습하기</p>
			</div>
			
			<div id="box-2">
				<form>
					이름 : <input type="text" name="username" id="user-name" class="form-control" value="홍길동"/> <br/>
					비번 : <input type="password" name="userpwd" id="user-pwd" class="form-control" value="zxcv1234"/> <br/>
					성별 : <input type="radio" name="usergender" id="user-gender-female" value="여자" checked/> 여성 
						   <input type="radio" name="usergender" id="user-gender-male" value="남성"/> 남성 <br/>
					기술 : <input type="checkbox" name="userskill" id="user-skill-1" value="java"/> 자바 
						   <input type="checkbox" name="userskill" id="user-skill-2" value="db" checked/> 데이터베이스 
						   <input type="checkbox" name="userskill" id="user-skill-2" value="python"/> 파이썬 <br/>
					경력 : <select name="career" id="user-career">
								<option value="1">1년이상</option>
								<option value="3">3년이상</option>
								<option value="5" selected>5년이상</option>
								<option value="7">7년이상</option>
						   </select> <br/>
					메모 : <textarea rows="5" cols="60" name="memo" id="user-memo" class="form-control">나는 나다</textarea>
				</form>
			</div>
			
			<div id="box-3">
				<div class="row">
					<div class="col-3">
						<img src="images/1.jpg" class="img-thumbnail" id="image-gallary" alt="고양이 사진"/>
					</div>
				</div>
			</div>
			
			<div id="box-4">
				<input type="text" id="form-element-1" disabled readonly />
				<input type="text" id="form-element-2" disabled />
				<input type="text" id="form-element-3" readonly />
				<input type="checkbox" id="form-element-4" checked />
				<input type="checkbox" id="form-element-5" />
				<button type="button" id="form-element-6" disabled>버튼</button>
				<button type="button" id="form-element-7">버튼</button>
			</div>
		</div>
		<script type="text/javascript">
			$('div').css({border:'1px solid black', padding:'10px;', margin:'10px'});
		
			// box-1의 p엘리먼트의 텍스트 컨텐츠 읽어오기
			var textContent1 = $("#box-1 p:eq(0)").text(); 
			var textContent2 = $("#box-1 p:eq(1)").text();
			console.log("첫번째 텍스트 컨텐츠", textContent1); // jQuery 연습하기
			console.log("두번째 텍스트 컨텐츠", textContent2); // jQuery 연습하기
			
			// box-1의 p엘리먼트의 html 컨텐츠 읽어오기
			var htmlContent1 = $("#box-1 p:eq(0)").html();
			var htmlContent2 = $("#box-1 p:eq(1)").html();
			console.log("첫번째 html 컨텐츠", htmlContent1); // jQuery 연습하기
			console.log("두번째 html 컨텐츠", htmlContent2); // <strong>jQuery</strong> 연습하기
			
			/////////////////////////////////////////////////
			// 폼 입력값 조회하기
			// 입력필드의 값 조회하기(input type="text")
			var name = $("#user-name").val();
			// 비밀번호 필드의 값 초회하기(int type="password")
			var pwd = $("#user-pwd").val();
			// 경력 조회하기(select)
			var career = $("#user-career").val();
			// 메모조회하기(text-memo)
			var memo = $("#user-memo").val();
			// 체크된 성별의 값 조회하기(radio)
			var gender = $(':radio[name=usergender]:checked').val();
			// 체크된 기술이ㅡ 값 조회하기(checkbox) <-- 본 예제에서는 1가지만 체크하는 것으로 가정함.
			var skill = $(':checkbox[name=userskill]:checked').val();
			
			console.log("이름", name);
			console.log("비번", pwd);
			console.log("성별", gender);
			console.log("기술", skill);
			console.log("경력", career);
			console.log("메모", memo);
			
			///////////////////////////////////////////////////
			// 속성값 조회하기
			var imageSrc = $('#image-gallary').attr("src");
			var imageClass = $('#image-gallary').attr("class");
			var imageId = $('#image-gallary').attr("id");
			var imageAlt = $('#image-gallary').attr("alt");
			
			console.log("이미지 소스 경로", imageSrc);
			console.log("이미지태그의 클래스", imageClass);
			console.log("이미지태그의 아이디", imageId);
			console.log("이미지에 대한 설명", imageAlt);
			
			////////////////////////////////////////////////////
			// 비활성화 여부 조회하기
			var isDisabled1 = $('#form-element-1').prop('disabled');
			var isDisabled2 = $('#form-element-2').prop('disabled');
			var isDisabled3 = $('#form-element-3').prop('disabled');
			var isDisabled4 = $('#form-element-4').prop('disabled');
			var isDisabled5 = $('#form-element-5').prop('disabled');
			var isDisabled6 = $('#form-element-6').prop('disabled');
			var isDisabled7 = $('#form-element-7').prop('disabled');
			
			// 읽기전용 여부
			var isReadOnly1 = $('#form-element-1').prop('readonly');
			var isReadOnly2 = $('#form-element-2').prop('readonly');
			var isReadOnly3 = $('#form-element-3').prop('readonly');
			var isReadOnly4 = $('#form-element-4').prop('readonly');
			var isReadOnly5 = $('#form-element-5').prop('readonly');
			var isReadOnly6 = $('#form-element-6').prop('readonly');
			var isReadOnly7 = $('#form-element-7').prop('readonly');
			
			// 체크 여부
			var isChecked1 = $('#form-element-1').prop('checked');
			var isChecked2 = $('#form-element-2').prop('checked');
			var isChecked3 = $('#form-element-3').prop('checked');
			var isChecked4 = $('#form-element-4').prop('checked');
			var isChecked5 = $('#form-element-5').prop('checked');
			var isChecked6 = $('#form-element-6').prop('checked');
			var isChecked7 = $('#form-element-7').prop('checked');
			
			console.log("비활성화 여부1", isDisabled1);
			console.log("비활성화 여부2", isDisabled2);
			console.log("비활성화 여부3", isDisabled3);
			console.log("비활성화 여부4", isDisabled4);
			console.log("비활성화 여부5", isDisabled5);
			console.log("비활성화 여부6", isDisabled6);
			console.log("비활성화 여부7", isDisabled7);
			
			console.log("읽기전용 여부1", isReadOnly1);
			console.log("읽기전용 여부2", isReadOnly2);
			console.log("읽기전용 여부3", isReadOnly3);
			console.log("읽기전용 여부4", isReadOnly4);
			console.log("읽기전용 여부5", isReadOnly5);
			console.log("읽기전용 여부6", isReadOnly6);
			console.log("읽기전용 여부7", isReadOnly7);
			
			console.log("체크 여부1", isChecked1);
			console.log("체크 여부2", isChecked2);
			console.log("체크 여부3", isChecked3);
			console.log("체크 여부4", isChecked4);
			console.log("체크 여부5", isChecked5);
			console.log("체크 여부6", isChecked6);
			console.log("체크 여부7", isChecked7);
		</script>
	</body>
</html>