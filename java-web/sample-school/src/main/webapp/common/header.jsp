<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<header class="my-3">
 	<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    	<div class="container">
      		<a class="navbar-brand" href="/sample-school/index">학사관리 시스템</a>
      		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        		<span class="navbar-toggler-icon"></span>
      		</button>
      		<div class="collapse navbar-collapse" id="navbarCollapse">
        		<ul class="navbar-nav me-auto mb-2 mb-md-0">
          			<li class="nav-item">
            			<a class="nav-link active" aria-current="page" href="/sample-school">홈</a>
          			</li>
          			<li class="nav-item dropdown">
          				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            				교수회원
          				</a>
          				<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            				<li><a class="dropdown-item" href="/sample-school/professor/courses.jsp">개설과정 현황</a></li>
            				<li><a class="dropdown-item disabled" href="/sample-school/professor/courseForm.jsp">신규 과정 개설</a></li>
            				<li><hr class="dropdown-divider"></li>
            				<li><a class="dropdown-item disabled" href="/sample-school/professor/registerForm.jsp">교수회원 가입</a></li>
          				</ul>
        			</li>
          			<li class="nav-item dropdown">
          				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            				학생회원
          				</a>
          				<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            				<li><a class="dropdown-item" href="/sample-school/student/courses.jsp">개설과정 조회</a></li>
            				<li><a class="dropdown-item" href="/sample-school/student/myList.jsp">수강신청내역 조회</a></li>
            				<li><hr class="dropdown-divider"></li>
            				<li><a class="dropdown-item" href="/sample-school/student/registerForm.jsp">학생회원 가입</a></li>
          				</ul>
        			</li>
        		</ul>
        		<ul class="navbar-nav">
          			<li class="nav-item">
            			<a class="nav-link" href="/sample-school/loginForm.jsp">로그인</a>
          			</li>
          			<li class="nav-item">
            			<a class="nav-link" href="/sample-school/student/info.jsp">홍길동</a>
          			</li>
          			<li class="nav-item">
            			<a class="nav-link" href="/sample-school/logout.jsp">로그아웃</a>
          			</li>
        		</ul>
      		</div>
		</div>
	</nav>
</header>