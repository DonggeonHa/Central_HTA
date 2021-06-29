<%@ page pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<a class="navbar-brand" href="/simple-board/main">고객 게시판</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"  aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item ${menu eq '홈' ? 'active' : '' }"><a class="nav-link" href="/simple-board/main">홈</a></li>
			<li class="nav-item ${menu eq '게시판' ? 'active' : ''}"><a class="nav-link" href="/simple-board/board/list">고객게시판</a></li>
		</ul>
		<ul class="navbar-nav my-2 my-lg-0">
			<c:choose>
				<c:when test="${empty LOGIN_USER }">
					<li class="nav-item ${menu eq '로그인' ? 'active' : '' }"><a class="nav-link" href="/simple-board/user/login">로그인</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item active"><a class="nav-link" href="/simple-board/user/logout">로그아웃</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</nav>