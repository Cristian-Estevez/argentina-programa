<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
		<meta name="description" content="" />
		<meta name="author" content="" />

		<!-- Bootstrap -->
		<!-- 
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
 -->
 
 		<!-- Bootstrap core JS-->
  		<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
		<!-- Core theme JS-->
		<script defer src="assets/javascript/scripts.js"></script>
				
		<title>Self Created WebApp</title>

		<link rel="icon" type="image/x-icon" href="images/favicon.ico" />
		<!-- Font Awesome icons (free version)-->
		<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
		<!-- Google fonts-->
		<link rel="preconnect" href="https://fonts.gstatic.com" />
		<link href="https://fonts.googleapis.com/css2?family=Tinos:ital,wght@0,400;0,700;1,400;1,700&amp;display=swap"
			rel="stylesheet" />
		<link
			href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400;1,500;1,700&amp;display=swap"
			rel="stylesheet" />
		<!-- Core theme CSS (includes Bootstrap)-->
		<link href="assets/stylesheets/styles.css" rel="stylesheet" />
	</head>

	<body>
		<!-- Background Video-->
		<video class="bg-video" playsinline="playsinline" autoplay="autoplay" muted="muted" loop="loop">
			<source src="images/mp4/bg.mp4" type="video/mp4" />
		</video>
		<!-- Masthead-->
		<div class="masthead">
			<div class="masthead-content text-white">
				<div class="container-fluid px-4 px-lg-0">
					<h1 class="fst-italic lh-1 mb-4">Self-Created <br> WebApp</h1>
					<p class="mb-5">My first Java developed WebApp</p>
					<form id="contactForm" method="post" action="login">
						<!-- Email address input-->
						<div class="row input-group-newsletter">
							<div class="col">
								<input class="form-control" name="username" type="text" placeholder="Ingresa tu nombre"/>
							</div>
							<div class="col-auto">
								<button class="btn btn-primary" id="submitButton" type="submit">Ingresar</button>
							</div>
						</div>
						
					</form>
				</div>
			</div>
		</div>
		<!-- Social Icons-->
		<!-- For more icon options, visit https://fontawesome.com/icons?d=gallery&p=2&s=brands-->
		<div class="social-icons">
			<div class="d-flex flex-row flex-lg-column justify-content-center align-items-center h-100 mt-3 mt-lg-0">
				<a class="btn btn-dark m-3" href="#!"><i class="fab fa-twitter"></i></a>
				<a class="btn btn-dark m-3" href="#!"><i class="fab fa-facebook-f"></i></a> <a class="btn btn-dark m-3"
					href="#!"><i class="fab fa-instagram"></i></a>
			</div>
		</div>
		
	</body>

	</html>