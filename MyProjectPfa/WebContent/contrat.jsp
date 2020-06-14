<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
<title>Car ESSAT</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=DM+Sans:300,400,700&display=swap"
	rel="stylesheet">

<link rel="stylesheet" href="fonts/icomoon/style.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.fancybox.min.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
<link rel="stylesheet" href="css/aos.css">


<link rel="stylesheet" href="css/style.css">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" href="WebContent/ss/vendors/linericon/style.css">
<link rel="stylesheet" href="ss/css/font-awesome.min.css">
<link rel="stylesheet"
	href="ss/vendors/owl-carousel/owl.carousel.min.css">
<link rel="stylesheet" href="ss/vendors/lightbox/simpleLightbox.css">
<link rel="stylesheet" href="ss/vendors/nice-select/css/nice-select.css">
<link rel="stylesheet" href="ss/vendors/animate-css/animate.css">
<link rel="stylesheet" href="ss/css/style.css">
<link rel="stylesheet" href="ss/css/responsive.css">

<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="devi/css/animate.css">

<link rel="stylesheet" href="devi/css/owl.carousel.min.css">
<link rel="stylesheet" href="devi/css/owl.theme.default.min.css">
<link rel="stylesheet" href="devi/css/magnific-popup.css">

<link rel="stylesheet" href="devi/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="devi/css/jquery.timepicker.css">

<link rel="stylesheet" href="devi/css/flaticon.css">
<link rel="stylesheet" href="devi/css/style.css">

</head>

<body data-spy="scroll" data-target=".site-navbar-target"
	data-offset="300">


	<div class="site-wrap" id="home-section">

		<div class="site-mobile-menu site-navbar-target">
			<div class="site-mobile-menu-header">
				<div class="site-mobile-menu-close mt-3">
					<span class="icon-close2 js-menu-toggle"></span>
				</div>
			</div>
			<div class="site-mobile-menu-body"></div>
		</div>



		<header class="site-navbar site-navbar-target" role="banner">

			<div class="container">
				<div class="row align-items-center position-relative">

					<div class="col-3 ">
						<div class="site-logo">
							<a href="Accueil">Bricollage</a>
						</div>
					</div>

					<div class="col-9  text-right">

						<span class="d-inline-block d-lg-none"><a href="#"
							class="text-white site-menu-toggle js-menu-toggle py-5 text-white"><span
								class="icon-menu h3 text-white"></span></a></span>


						<nav class="site-navigation text-right ml-auto d-none d-lg-block"
							role="navigation">
							<ul class="site-menu main-menu js-clone-nav ml-auto ">



								<%
									Object compte = session.getAttribute("compte");

									if (compte == null) {
								%>
								<li><a href="Connexion">Se Connecter</a></li>
								<li><a href="Ajout_Demandeur">Inscri</a></li>
								<li><a href="Ajout_Fournisseur">Devenir Bricoleur</a></li>
								<%
									} else {
								%>
								<c:choose>
									<c:when test="${compte.getRole().getId_role()==1}">

										<li><a href="Dashbord" class="nav-link"><font
												color="red"><h4>ADMIN</h1></font> </a></li>
												<li><a href="Profile" class="nav-link">${compte.getUser().getPrenom()}
												${compte.getUser().getNom()}</a></li>

									</c:when>
									<c:otherwise>
										<li><a href="Profile" class="nav-link">${compte.getUser().getPrenom()}
												${compte.getUser().getNom()}</a></li>
									</c:otherwise>
								</c:choose>
								<c:choose>
								<c:when test="${id3>0}">
								<li class="active"><a href="Messagerie?id=${id3}" class="nav-link">BoiteMsg(${size })</a></li>
								</c:when>
								<c:otherwise>
								<li class="active"><a href="Messagerie" class="nav-link">BoiteMsg(${size })</a></li>
								</c:otherwise>
								
								</c:choose>
								<li class=""><a href="ListeContrat" class="nav-link">Notification<font
										color="red">(${size2 })</font></a></li>
								<li><a href="Deconnexion" class="nav-link">Déconnexion
								</a></li>
								<%
									}
								%>

							</ul>
						</nav>


					</div>


				</div>
			</div>

		</header>



		<div class="hero-wrap">
			<div class="home-slider owl-carousel">
				<div class="slider-item"
					style="background-image: url(devi/images/bg_1.jpg);">
					<div class="overlay"></div>
					<div class="container">
						<div
							class="row no-gutters slider-text align-items-center justify-content-start">
							<div class="col-md-6 ftco-animate">
								<div class="text w-100">
									<h2>We are best car repair services</h2>
									<h1 class="mb-4">Make your car last longer</h1>
									<p>
										<a href="#" class="btn btn-primary">Book an appointment</a>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="slider-item"
					style="background-image: url(devi/images/bg_2.jpg);">
					<div class="overlay"></div>
					<div class="container">
						<div
							class="row no-gutters slider-text align-items-center justify-content-start">
							<div class="col-md-6 ftco-animate">
								<div class="text w-100">
									<h2>We care about your car</h2>
									<h1 class="mb-4">It's time to come to repair your car</h1>
									<p>
										<a href="#" class="btn btn-primary">Book an appointment</a>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<section class="intro">
			<div class="container intro-wrap">
				<div class="row no-gutters">
					<div
						class="col-md-12 col-lg-9 bg-intro d-sm-flex align-items-center align-items-stretch">
						<div class="intro-box d-flex align-items-center">
							<div
								class="icon d-flex align-items-center justify-content-center">
								<i class="flaticon-repair"></i>
							</div>
							<h2 class="mb-0">
								Are you ready? <span>Let's repair it now!</span>
							</h2>
						</div>
						<a href="#"
							class="bg-primary btn-custom d-flex align-items-center"><span>Book
								an Appointment</span></a>
					</div>
				</div>
			</div>
		</section>

		<section class="ftco-section">
			<div class="container">
				<div class="row justify-content-center pb-5 mb-3">
					<div class="col-md-7 heading-section text-center ftco-animate">
						<span class="subheading">We offer Services</span>
						<h2>Our car services</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4 services ftco-animate">
						<div class="d-block d-flex">
							<div
								class="icon d-flex justify-content-center align-items-center">
								<span class="flaticon-car-service"></span>
							</div>
							<div class="media-body pl-3">
								<h3 class="heading">Oil change</h3>
								<p>Even the all-powerful Pointing has no control about the
									blind texts it is an almost unorthographic.</p>
								<p>
									<a href="#" class="btn-custom">Read more</a>
								</p>
							</div>
						</div>
						<div class="d-block d-flex">
							<div
								class="icon d-flex justify-content-center align-items-center">
								<span class="flaticon-tyre"></span>
							</div>
							<div class="media-body pl-3">
								<h3 class="heading">Tire Change</h3>
								<p>Even the all-powerful Pointing has no control about the
									blind texts it is an almost unorthographic.</p>
								<p>
									<a href="#" class="btn-custom">Read more</a>
								</p>
							</div>
						</div>

					</div>
					<div class="col-md-4 services ftco-animate">
						<div class="d-block d-flex">
							<div
								class="icon d-flex justify-content-center align-items-center">
								<span class="flaticon-battery"></span>
							</div>
							<div class="media-body pl-3">
								<h3 class="heading">Batteries</h3>
								<p>Even the all-powerful Pointing has no control about the
									blind texts it is an almost unorthographic.</p>
								<p>
									<a href="#" class="btn-custom">Read more</a>
								</p>
							</div>
						</div>
						<div class="d-block d-flex">
							<div
								class="icon d-flex justify-content-center align-items-center">
								<span class="flaticon-car-engine"></span>
							</div>
							<div class="media-body pl-3">
								<h3 class="heading">Engine Repair</h3>
								<p>Even the all-powerful Pointing has no control about the
									blind texts it is an almost unorthographic.</p>
								<p>
									<a href="#" class="btn-custom">Read more</a>
								</p>
							</div>
						</div>
					</div>

					<div class="col-md-4 services ftco-animate">
						<div class="d-block d-flex">
							<div
								class="icon d-flex justify-content-center align-items-center">
								<span class="flaticon-tow-truck"></span>
							</div>
							<div class="media-body pl-3">
								<h3 class="heading">Tow Truck</h3>
								<p>Even the all-powerful Pointing has no control about the
									blind texts it is an almost unorthographic.</p>
								<p>
									<a href="#" class="btn-custom">Read more</a>
								</p>
							</div>
						</div>
						<div class="d-block d-flex">
							<div
								class="icon d-flex justify-content-center align-items-center">
								<span class="flaticon-repair"></span>
							</div>
							<div class="media-body pl-3">
								<h3 class="heading">Car Maintenance</h3>
								<p>Even the all-powerful Pointing has no control about the
									blind texts it is an almost unorthographic.</p>
								<p>
									<a href="#" class="btn-custom">Read more</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>



		<section class="ftco-counter" id="section-counter">
			<div class="container">
				<div class="row">
					<div
						class="col-md-6 col-lg-3 d-flex justify-content-center counter-wrap ftco-animate">
						<div class="block-18 text-center">
							<div class="text">
								<strong class="number" data-number="45">0</strong>
							</div>
							<div class="text">
								<span>Years of Experienced</span>
							</div>
						</div>
					</div>
					<div
						class="col-md-6 col-lg-3 d-flex justify-content-center counter-wrap ftco-animate">
						<div class="block-18 text-center">
							<div class="text">
								<strong class="number" data-number="8500">0</strong>
							</div>
							<div class="text">
								<span>Project completed</span>
							</div>
						</div>
					</div>
					<div
						class="col-md-6 col-lg-3 d-flex justify-content-center counter-wrap ftco-animate">
						<div class="block-18 text-center">
							<div class="text">
								<strong class="number" data-number="2342">0</strong>
							</div>
							<div class="text">
								<span>Happy Customers</span>
							</div>
						</div>
					</div>
					<div
						class="col-md-6 col-lg-3 d-flex justify-content-center counter-wrap ftco-animate">
						<div class="block-18 text-center">
							<div class="text">
								<strong class="number" data-number="30">0</strong>
							</div>
							<div class="text">
								<span>Award Winning</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

		<section
			class="ftco-appointment ftco-section ftco-no-pt ftco-no-pb img"
			style="background-image: url(images/fournisseur/${dispo.getCompte().getUser().getImage()}.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div class="row d-md-flex justify-content-end">
					<div
						class="col-md-12 col-lg-6 half p-3 py-5 pl-lg-5 ftco-animate heading-section heading-section-white">

						<h2 class="mb-4">
							Realisez votre Devis Pour Service:<font color="red">${dispo.getService().getLibelle()}</font>
						</h2>
						<form action="AddContrat" method="post" class="appointment">
							<div class="row">

								<div class="col-md-6">
									<div class="form-group">
										<input type="text" class="form-control" name="address"
											placeholder="Address">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" class="form-control" name="prix"
											placeholder="Prix souhaite/heure">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<div class="input-wrap">
											<div class="icon">
												<span class="fa fa-calendar"></span>
											</div>
											<input type="text" class="form-control appointment_date"
												name="date" placeholder="Date prevu ">
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<div class="input-wrap">
											<div class="icon">
												<span class="fa fa-clock-o"></span>
											</div>
											<input type="text" class="form-control appointment_time"
												name="time" placeholder="Time">
										</div>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<textarea id="description" cols="30" rows="7"
											class="form-control" name="description"
											placeholder="Description"></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<input type="submit" value="Send devis"
											class="btn btn-dark py-3 px-4">
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>

		<section class="ftco-section testimony-section bg-light">
			<div class="container">
				<div class="row justify-content-center pb-5 mb-3">
					<div
						class="col-md-7 heading-section heading-section-white text-center ftco-animate">
						<span class="subheading">Testimonies</span>
						<h2>Happy Clients &amp; Feedbacks</h2>
					</div>
				</div>
				<div class="row ftco-animate">
					<div class="col-md-12">
						<div class="carousel-testimony owl-carousel ftco-owl">
							<div class="item">
								<div class="testimony-wrap py-4">
									<div
										class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-quote-left"></span>
									</div>
									<div class="text">
										<p class="mb-4">Far far away, behind the word mountains,
											far from the countries Vokalia and Consonantia, there live
											the blind texts.</p>
										<div class="d-flex align-items-center">
											<div class="user-img"
												style="background-image: url(images/person_1.jpg)"></div>
											<div class="pl-3">
												<p class="name">Roger Scott</p>
												<span class="position">Marketing Manager</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="testimony-wrap py-4">
									<div
										class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-quote-left"></span>
									</div>
									<div class="text">
										<p class="mb-4">Far far away, behind the word mountains,
											far from the countries Vokalia and Consonantia, there live
											the blind texts.</p>
										<div class="d-flex align-items-center">
											<div class="user-img"
												style="background-image: url(images/person_2.jpg)"></div>
											<div class="pl-3">
												<p class="name">Roger Scott</p>
												<span class="position">Marketing Manager</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="testimony-wrap py-4">
									<div
										class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-quote-left"></span>
									</div>
									<div class="text">
										<p class="mb-4">Far far away, behind the word mountains,
											far from the countries Vokalia and Consonantia, there live
											the blind texts.</p>
										<div class="d-flex align-items-center">
											<div class="user-img"
												style="background-image: url(images/person_3.jpg)"></div>
											<div class="pl-3">
												<p class="name">Roger Scott</p>
												<span class="position">Marketing Manager</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="testimony-wrap py-4">
									<div
										class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-quote-left"></span>
									</div>
									<div class="text">
										<p class="mb-4">Far far away, behind the word mountains,
											far from the countries Vokalia and Consonantia, there live
											the blind texts.</p>
										<div class="d-flex align-items-center">
											<div class="user-img"
												style="background-image: url(images/person_1.jpg)"></div>
											<div class="pl-3">
												<p class="name">Roger Scott</p>
												<span class="position">Marketing Manager</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="testimony-wrap py-4">
									<div
										class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-quote-left"></span>
									</div>
									<div class="text">
										<p class="mb-4">Far far away, behind the word mountains,
											far from the countries Vokalia and Consonantia, there live
											the blind texts.</p>
										<div class="d-flex align-items-center">
											<div class="user-img"
												style="background-image: url(images/person_2.jpg)"></div>
											<div class="pl-3">
												<p class="name">Roger Scott</p>
												<span class="position">Marketing Manager</span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>



		<section class="ftco-section ftco-no-pb">
			<div class="container">
				<div class="row justify-content-center pb-5 mb-3">
					<div class="col-md-7 heading-section text-center ftco-animate">
						<span class="subheading">Projects</span>
						<h2>Done Projects</h2>
					</div>
				</div>
			</div>
			<div class="container-fluid px-md-0">
				<div class="row no-gutters">
					<div class="col-md-3 ftco-animate">
						<div class="work img d-flex align-items-end"
							style="background-image: url(devi/images/work-1.jpg);">
							<a href="images/work-1.jpg"
								class="icon image-popup d-flex justify-content-center align-items-center">
								<span class="fa fa-expand"></span>
							</a>
							<div class="desc w-100 px-4">
								<div class="text w-100 mb-3">
									<span>Engine</span>
									<h2>
										<a href="work-single.html">Engine Testing Complated</a>
									</h2>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 ftco-animate">
						<div class="work img d-flex align-items-end"
							style="background-image: url(devi/images/work-2.jpg);">
							<a href="images/work-2.jpg"
								class="icon image-popup d-flex justify-content-center align-items-center">
								<span class="fa fa-expand"></span>
							</a>
							<div class="desc w-100 px-4">
								<div class="text w-100 mb-3">
									<span>Oil Change</span>
									<h2>
										<a href="work-single.html">Change Oil Completed</a>
									</h2>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 ftco-animate">
						<div class="work img d-flex align-items-end"
							style="background-image: url(devi/images/work-3.jpg);">
							<a href="images/work-3.jpg"
								class="icon image-popup d-flex justify-content-center align-items-center">
								<span class="fa fa-expand"></span>
							</a>
							<div class="desc w-100 px-4">
								<div class="text w-100 mb-3">
									<span>Engine</span>
									<h2>
										<a href="work-single.html">Engine Diagnostics</a>
									</h2>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-3 ftco-animate">
						<div class="work img d-flex align-items-end"
							style="background-image: url(devi/images/work-4.jpg);">
							<a href="images/work-4.jpg"
								class="icon image-popup d-flex justify-content-center align-items-center">
								<span class="fa fa-expand"></span>
							</a>
							<div class="desc w-100 px-4">
								<div class="text w-100 mb-3">
									<span>Tire</span>
									<h2>
										<a href="work-single.html">Tire Change</a>
									</h2>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>


		<footer class="site-footer">
			<div class="container">
				<div class="row">
					<div class="col-lg-3">
						<h2 class="footer-heading mb-4">A propos</h2>
						<p></p>
					</div>
					<div class="col-lg-8 ml-auto">
						<div class="row">
							<div class="col-lg-3">
								<h2 class="footer-heading mb-4">Links</h2>
								<ul class="list-unstyled">
									<li><a href="#">Home</a></li>
									<li><a href="#">Liste des voitures</a></li>

								</ul>
							</div>



						</div>
					</div>
				</div>
				<div class="row pt-5 mt-5 text-center">
					<div class="col-md-12">
						<div class="border-top pt-5">
							<p>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;
								<script>
									document.write(new Date().getFullYear());
								</script>
								All rights reserved | Chaker
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</p>
						</div>
					</div>

				</div>
			</div>
		</footer>



	</div>

	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.sticky.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.animateNumber.min.js"></script>
	<script src="js/jquery.fancybox.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/bootstrap-datepicker.min.js"></script>
	<script src="js/aos.js"></script>

	<script src="js/main.js"></script>
	<script src="ss/js/jquery-3.2.1.min.js"></script>
	<script src="ss/js/popper.js"></script>
	<script src="ss/js/bootstrap.min.js"></script>
	<script src="ss/js/stellar.js"></script>
	<script src="ss/vendors/lightbox/simpleLightbox.min.js"></script>
	<script src="ss/vendors/nice-select/js/jquery.nice-select.min.js"></script>
	<script src="ss/vendors/isotope/imagesloaded.pkgd.min.js"></script>
	<script src="ss/vendors/isotope/isotope-min.js"></script>
	<script src="ss/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script src="ss/js/jquery.ajaxchimp.min.js"></script>
	<script src="ss/vendors/counter-up/jquery.waypoints.min.js"></script>
	<script src="ss/vendors/counter-up/jquery.counterup.js"></script>
	<script src="ss/js/mail-script.js"></script>
	<script src="ss/js/theme.js"></script>
	<script src="devi/js/jquery.min.js"></script>
	<script src="devi/js/jquery-migrate-3.0.1.min.js"></script>
	<script src="devi/js/popper.min.js"></script>
	<script src="devi/js/bootstrap.min.js"></script>
	<script src="devi/js/jquery.easing.1.3.js"></script>
	<script src="devi/js/jquery.waypoints.min.js"></script>
	<script src="devi/js/jquery.stellar.min.js"></script>
	<script src="devi/js/jquery.animateNumber.min.js"></script>
	<script src="devi/js/bootstrap-datepicker.js"></script>
	<script src="devi/js/jquery.timepicker.min.js"></script>
	<script src="devi/js/owl.carousel.min.js"></script>
	<script src="devi/js/jquery.magnific-popup.min.js"></script>
	<script src="devi/js/scrollax.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script src="devi/js/google-map.js"></script>
	<script src="devi/js/main.js"></script>

</body>

</html>