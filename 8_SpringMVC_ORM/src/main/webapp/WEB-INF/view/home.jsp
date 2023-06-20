<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="<c:url value="/resource/css/style.css"></c:url>">
<script type="text/javascript"
	src="<c:url value="/resource/js/script.js"></c:url>"></script>
</head>
<body style="background-color: #f0f0f0">
	<div class="text-center">
		<h1>Home page</h1>
		<a href="register" class="btn btn-primary btn-sm">Register</a> <a
			href="google" class="btn btn-danger btn-sm">Go to Google</a> <a
			href="yahoo" class="btn btn-warning btn-sm">Go to Yahoo</a> <a
			href="load_file_upload" class="btn btn-primary btn-sm">File
			Upload</a>

		<div class="container p-5">
			<div class="row">
				<div class="col-md-8 offset-md-2">
					<div class="card">
						<div class="card-body">
							<h2>My Search Engine</h2>
							<form action="search" method="post">
								<div class="mb-3">
									<input type="text" name="keyword" placeholder="Enter Keyword"
										class="form-control">
									<button class="btn btn-sm btn-primary mt-3">Search
										Google</button>

								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="text-center">
			<img alt="" src="<c:url value="/resource/img/nature.png"></c:url>"
				width="500px" height="250px">
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>