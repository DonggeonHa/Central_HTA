<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-3">
	<div class="container-fluid">
		<a class="navbar-brand" href="/sample-mvc/home">샘플 애플리케이션</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      		<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbar-menu-link">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li><a class="nav-link ${currentPage eq 'home' ? 'active' : '' }" href="/sample-mvc/home">홈</a></li> 
				<li><a class="nav-link ${currentPage eq 'board' ? 'active' : '' }" href="/sample-mvc/board/list">게시판</a></li>
			</ul>
			<c:choose>
				<c:when test="${empty LOGIN_USER }">
					<ul class="navbar-nav">
						<li><a class="nav-link ${currentPage eq 'login' ? 'active' : '' }"  href="/sample-mvc/login">로그인</a></li>
						<li><a class="nav-link ${currentPage eq 'register' ? 'active' : '' }" href="/sample-mvc/register">회원가입</a></li> 
					</ul>
				</c:when>
				<c:otherwise>
					<span class="navbar-text text-white"><span class="fw-bolder">${LOGIN_USER.name }</span>님 환영합니다.</span> 
					<ul class="navbar-nav">
						<li><a class="nav-link ${currentPage eq 'register' ? 'active' : '' }" href="/sample-mvc/logout">로그아웃</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</nav>