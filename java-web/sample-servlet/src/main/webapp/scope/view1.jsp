<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<title>View Scope1</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-12">
					<table class="table">
						<thead>
							<tr>
								<th>Request Scope</th><td>${req}</td>
							</tr>
							<tr>
								<th>Session Scope</th><td>${ses}</td>
							</tr>
							<tr>
								<th>Application Scope</th><td>${app}</td>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>