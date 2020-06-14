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
				style="background-image: url('images/contrat.jpg')">
				<div class="container">
					<div class="section-top-border">
					</br>
		</br>

						<div class="row">
							<div class="col-md-3">
								<div class="list-group">
									<a href="ListeContrat" class="list-group-item success "> <span
										class="glyphicon glyphicon-envelope"> </span> Contrats réçus <span
										class="badge badge-warning"> ${size1}</span>
									</a> <a href="ContratEnCours" class="list-group-item success"> <span
										class="glyphicon glyphicon-check"> </span> Contrats en cours <span
										class="badge badge-warning">${size3}</span>
									</a> <a href="ContratEnvoye" class="list-group-item success"> <span
										class="glyphicon glyphicon-th"> </span> Contrats Envoye <span
										class="badge badge-warning">${size4}</span>
									</a> <a href="" class="list-group-item list-group-item-danger">
										<span class="glyphicon glyphicon-trash"> </span> Contrats
										Spams <span class="badge badge-warning">5</span>
									</a>
								</div>
							</div>

							<div class="col-md-9">
								<c:if test="${size2 > 0}">
									<div class="col-md-12">
										<div class="alert alert-danger">
											<h4>Vous avez ${size2} nouveaux Contrats</h4>
										</div>

									</div>
								</c:if>

								<div class="col-md-12">


									<div class="panel panel-primary">
										<div class="panel-heading">Liste des Contrats Reçus</div>
										<table class="table table-hover">

											<thead>

												<tr>
													<th>Num Contrat</th>
													<th>Vers</th>

													<th>Tel</th>
													<th>Address</th>
													<th>Date Travaux</th>
													<th>Action</th>
												</tr>

											</thead>
											<tbody>
												<c:forEach items="${contrat_evoye}" var="c">
													<c:choose>
														<c:when test="${c.getReceiveread()==0}">
															<tr class="bg info">
														</c:when>
														<c:otherwise>
															<tr class="bg white">
														</c:otherwise>
													</c:choose>
													<td>${c.getId()}</td>
													<td>${c.getDispo().getCompte().getUser().getNom()}
														${c.getDispo().getCompte().getUser().getPrenom()}</td>
													<td>${c.getDispo().getCompte().getUser().getTel()}</td>
													<td>${c.getAddress()}</td>
													<td>${c.getDate()}</td>

													<td><a class="btn btn-info"
														href="DetailContratEnvoye?id=${c.getId()}"> <span
															class="glyphicon glyphicon-envelope"></span>
													</a> <a class="btn btn-danger"
														href="DeleteContratEnvoye?id=${c.getId()}"> <span
															class="glyphicon glyphicon-trash"></span>
													</a></td>
													</tr>

												</c:forEach>

											</tbody>

										</table>




									</div>
								</div>
							</div>
						</div>

					</div>
				</div>

			</div>
		</div>

		<div class="site-section bg-light" id="contact-section">


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
										document
												.write(new Date().getFullYear());
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