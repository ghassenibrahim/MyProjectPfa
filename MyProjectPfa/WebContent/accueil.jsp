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



		<div class="ftco-blocks-cover-1">
			<div class="ftco-cover-1 overlay innerpage"
				style="background-image: url('images/14.jpg')">
				<section class="home_banner_area">
					<div class="banner_inner d-flex align-items-center">

						<div class="container">
							<div class="banner_content text-center">
								<h3>
									Build Your <span>Dream</span>
								</h3>
								<a class="black_btn" href="ListeDemande">TROUVER UNE
									ANNONCE</a> <a class="black_btn" href="ListeBricoleur">TROUVER
									UN BRICOLEUR</a>
							</div>
						</div>
					</div>
				</section>
			</div>
		</div>


		<div class="site-section pt-0 pb-0 bg-light">
			<div class="container">
				<div class="row">
					<div class="col-12">

						<form class="trip-form" action="AddDemande" method="post">
							<div class="row align-items-center mb-4">
								<div class="col-md-6">
									<h3 class="m-0">GET YOUR BEST PROVIDER</h3>
								</div>
								<div class="col-md-6 text-md-right">
									<span class="text-primary">12</span> <span>Demandes</span></span>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-2">
									<label for="cf-1">titre</label> <input type="text" id="cf-1"
										name ="titre" placeholder="titre" class="form-control">
								</div>
								<div class="form-group col-md-2">
									<label for="cf-1">service</label> <select name="specialite" class="form-control">
									<c:forEach items="${service}" var="s">
										<option value="${s.getId()}">${s.getLibelle()}</option>
										
										</c:forEach>

									</select>

								</div>
								<div class="form-group col-md-3">
									<label for="cf-1">address</label> <input type="text" id="cf-1"
									name="address"	placeholder="address" class="form-control">
								</div>

								<div class="form-group col-md-1">
									<label for="cf-1">prix</label> <input type="text" id="cf-1"
										name="prix" placeholder="prix" class="form-control">
								</div>


								<div class="form-group col-md-2">
									<label for="cf-3">date travaux</label> <input type="text"
										name="date_travaux" id="cf-3" placeholder="date_travaux"
										class="form-control datepicker px-3">
								</div>

							</div>
							<div class="row">

								<div class="form-group col-md-5">
									<label for="cf-1">description</label> <input type="text"
										name="description" id="cf-1" placeholder="description" class="form-control">
								</div>

								<div class="form-group col-md-4">
									<label for="cf-3">selectionnez une image</label> <input type="file" name="image"
										id="cf-3" placeholder=""
										class="form-control ">
								</div>

								

							</div>

							<div class="row">
								<div class="col-lg-6">
									<input type="submit" value="Enregistrer"
										class="btn btn-primary">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>



		<div class="site-section bg-light">
			<div class="container">
				<div class="row">
					<div class="col-lg-3">
						<h3>Nos promotions</h3>
						<p class="mb-4">Profitez des nos meilleures offres de location
							voiture Tunisie chez Car_ESSAT, un des leaders de loueurs de
							voitures en Tunisie</p>
						<p>
							<a href="#" class="btn btn-primary custom-prev">Previous</a> <span
								class="mx-2">/</span> <a href="#"
								class="btn btn-primary custom-next">Next</a>
						</p>
					</div>





					<div class="col-lg-9">
						<div class="nonloop-block-13 owl-carousel">
							<c:forEach items="${promo}" var="promo">
								<div class="item-1">
									<a href="#"><img src="images/promo/${promo.image}.jpg"
										alt="Image" width="100%" height="200"></a>
									<div class="item-1-contents">
										<div class="text-center">
											<h3>
												<a href="#">${promo.getService().getLibelle()} </a>
											</h3>
											<div class="rating">
												<span class="icon-star text-warning"></span> <span
													class="icon-star text-warning"></span> <span
													class="icon-star text-warning"></span> <span
													class="icon-star text-warning"></span> <span
													class="icon-star text-warning"></span>
											</div>
											<div class="rent-price">
												<span><font color="red">${promo.getCompte().getUser().getPrix()}</font>
													DT/</span>Jour
											</div>
										</div>

										<ul class="specs">
											<li><span>Nom et Prenom</span> <span class="spec">${promo.getCompte().getUser().getNom()}
													${promo.getCompte().getUser().getPrenom()}</span></li>
											<li><span>Tel</span> <span class="spec">${promo.getCompte().getUser().getTel()}</span></li>
											<li><span>Adress</span> <span class="spec">${promo.getCompte().getUser().getCountry()}
													${promo.getCompte().getUser().getCity()}</span></li>
											<li><span>OFFRE</span> <span class="spec"><font
													color="red">${promo.offre}</font></span></li>
											<li><span>A publié à: </span> <span class="spec">${promo.date_publication}</span></li>
										</ul>


										<div class="d-flex action">
											<a href="Contact?id=${promo.getCompte().getId()}"
												class="btn btn-primary">Contacter</a>
										</div>
									</div>

								</div>

							</c:forEach>
						</div>

					</div>
				</div>
			</div>
		</div>

		<div class="site-section section-3"
			style="background-image: url('images/hero_2.jpg');">
			<div class="container">
				<div class="row">
					<div class="col-12 text-center mb-5">
						<h2 class="text-white">Our services</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						<div class="service-1">
							<span class="service-1-icon"> <span class="flaticon-car-1"></span>
							</span>
							<div class="service-1-contents">
								<h3>Réparation instantanée</h3>
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="service-1">
							<span class="service-1-icon"> <span
								class="flaticon-traffic"></span>
							</span>
							<div class="service-1-contents">
								<h3>Variété des services</h3>
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="service-1">
							<span class="service-1-icon"> <span class="flaticon-valet"></span>
							</span>
							<div class="service-1-contents">
								<h3>Rapidité</h3>
								<p></p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>



		<div class="site-section bg-light">
			<div class="container">
				<div class="row justify-content-center text-center mb-5">
					<div class="col-7 text-center mb-5">
						<h2>Ce qu'en disent nos clients</h2>
						<p></p>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4 mb-4 mb-lg-0">
						<div class="testimonial-2">
							<blockquote class="mb-4">
								<p>"Agent professionnel, jovial et serviable, je recommande
									votre agence aux professionnels "</p>
							</blockquote>
							<div class="d-flex v-card align-items-center">
								<img src="images/person_1.jpg" alt="Image"
									class="img-fluid mr-3"> <span>Ali Ben Salah</span>
							</div>
						</div>
					</div>
					<div class="col-lg-4 mb-4 mb-lg-0">
						<div class="testimonial-2">
							<blockquote class="mb-4">
								<p>"Top ! Rien à dire. Disponibilité, gentillesse du
									personnel ainsi que etat de la voiture. Je reviend."</p>
							</blockquote>
							<div class="d-flex v-card align-items-center">
								<img src="images/person_2.jpg" alt="Image"
									class="img-fluid mr-3"> <span>Aya Ben SAlah</span>
							</div>
						</div>
					</div>
					<div class="col-lg-4 mb-4 mb-lg-0">
						<div class="testimonial-2">
							<blockquote class="mb-4">
								<p>"Excellent loueur, rien d'autres, merci pour votre
									service. Je reviens dans un autre temps"</p>
							</blockquote>
							<div class="d-flex v-card align-items-center">
								<img src="images/person_3.jpg" alt="Image"
									class="img-fluid mr-3"> <span>Amira ben salah</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>



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

</body>

</html>

