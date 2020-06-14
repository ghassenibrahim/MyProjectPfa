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

<link rel="stylesheet" href="ss/WebContent/vendors/linericon/style.css">
<link rel="stylesheet" href="ss/css/font-awesome.min.css">
<link rel="stylesheet"
	href="ss/vendors/owl-carousel/owl.carousel.min.css">
	  <link rel="stylesheet" href="ss/vendors/linericon/style.css">
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


		<section class="banner_area">
			<div class="banner_inner d-flex align-items-center">
				<div class="overlay bg-parallax" data-stellar-ratio="0.9"
					data-stellar-vertical-offset="0" data-background=""></div>
				<div class="container">
					<div class="banner_content text-center">
						<div class="page_link">
							<a href="index.html">Home</a> <a href="contact.html">Contact</a>
						</div>
						<h2>Contact Us</h2>
					</div>
				</div>
			</div>
		</section>
		<!--================End Home Banner Area =================-->

		<!--================Contact Area =================-->
		<section class="contact_area p_120">
			<div class="container">
				<div id="mapBox" class="mapBox" data-lat="40.701083"
					data-lon="-74.1522848" data-zoom="13"
					data-info="PO Box CT16122 Collins Street West, Victoria 8007, Australia."
					data-mlat="40.701083" data-mlon="-74.1522848"></div>
				<div class="row">
					<div class="col-lg-3">
						<div class="contact_info">
							<%
								Object dispo = request.getAttribute("dispo");
							%>
							<div class="info_item">

								<i class="lnr lnr-pointer-right"></i>
								<h6>${dispo.getCompte().getUser().getNom()}
									${dispo.getCompte().getUser().getPrenom()}</h6>
								<p>Santa monica bullevard</p>
							</div>
							<div class="info_item">

								<i class="lnr lnr-home"></i>
								<h6>${dispo.getCompte().getUser().getCountry()}
									${dispo.getCompte().getUser().getCity()}</h6>
								<p>Santa monica bullevard</p>
							</div>
							<div class="info_item">
								<i class="lnr lnr-phone-handset"></i>
								<h6>
									${dispo.getCompte().getUser().getTel()} </a>
								</h6>
								<p>Mon to Fri 9am to 6 pm</p>
							</div>
							<div class="info_item">
								<i class="lnr lnr-envelope"></i>
								<h6>${dispo.getCompte().getUser().getExperience()}</h6>
								<p>Send us your query anytime!</p>
							</div>
							<div class="info_item">
								<i class="lnr lnr-graduation-hat"></i>
								<h6>
									${dispo.getService().getLibelle()} </a>
								</h6>
								<p>Send us your query anytime!</p>
							</div>

						</div>
					</div>
					<div class="col-lg-9">
						<form class="row contact_form" action="Send_msg1" method="GET"
							novalidate="novalidate">
							<div class="col-md-6">
								<img
									src="images/fournisseur/${dispo.getCompte().getUser().getImage()}.jpg "
									weight="150%" height="150">
							</div>


							<div class="col-md-6">

								<form class="row contact_form" action="1111111111" method="GET"
									novalidate="novalidate">

									<div class="form-group">
										<textarea class="form-control" name="message" id="message"
											rows="1" placeholder="Enter Message"></textarea>
									</div>
							</div>
							<div class="col-md-12 text-right">
								<button type="submit" value="submit" class="btn submit_btn">Send
									Message</button>

							</div>

						</form>

					</div>

				</div>
				<div class="row">
					<div class="col-lg-12 posts-list">
						<%
							Object intervention = session.getAttribute("intervention");

							if (intervention != null) {
						%>
						<div class="col-lg-6 ">


							<h4>Leave a comment</h4>

							<form method="GET" action="AddComment">

								<div class="form-group">
									<input type="text" class="form-control" name="comment"
										placeholder="Comment" onfocus="this.placeholder = ''"
										onblur="this.placeholder = 'Comment'">
								</div>

								<div class="col-md-12 text-right">
									<button type="submit" value="submit"
										class="genric-btn info-border">Comment</button>
								</div>


							</form>

						</div>

						<%
							}
						%>

						<div class="col-lg-6 ">


							<div class="comments-area">
								<h4>${size5}Comments</h4>
								<c:forEach items="${commentaire}" var="c">
									<div class="comment-list">
										<div class="single-comment justify-content-between d-flex">
											<div class="user justify-content-between d-flex">
												<div class="thumb">
													<img src="images/fournisseur/1.jpg" width="50" height="50">
												</div>
												<div class="desc">
													<h5>${c.getComment()}</h5>

													<p class="date">Le 12/08/2020 à 12:03</p>
													<p class="comment">
														<font color="red">
															${c.getIntervention().getContrat().getCompte().getUser().getNom()}
															${c.getIntervention().getContrat().getCompte().getUser().getPrenom()}
														</font>
													</p>
												</div>
											</div>
											<div class="reply-btn">
												<a href="" class="btn-reply text-uppercase">reply</a>
											</div>
										</div>
									</div>
								</c:forEach>
							</div>
						</div>

					</div>

				</div>
		</section>
		<!--================Contact Area =================-->

		<!--================ start footer Area  =================-->
		<footer class="footer-area p_120">
			<div class="container">
				<div class="row">
					<div class="col-lg-3  col-md-6 col-sm-6">
						<div class="single-footer-widget ab_wd">
							<h6 class="footer_title">About Us</h6>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore dolore magna aliqua.</p>
						</div>
					</div>
					<div class="col-lg-3 col-md-6 col-sm-6">
						<div class="single-footer-widget contact_wd">
							<h6 class="footer_title">Contact Us</h6>
							<p>56/8, Santa Monica bullevard, Los angeles, california,
								United states of america</p>
							<a href="tel:01265325689746">012-6532-568-9746</a> <a
								href="tel:01265325689746">012-6532-568-9746</a>
						</div>
					</div>
					<div class="col-lg-5 col-md-6 col-sm-6 offset-lg-1">
						<div class="single-footer-widget">
							<h6 class="footer_title">Newsletter</h6>
							<p>You can trust us. we only send promo offers, not a single
								spam.</p>
							<div id="mc_embed_signup">
								<form target="_blank"
									action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
									method="get" class="subscribe_form relative">
									<div class="input-group d-flex flex-row">
										<input name="EMAIL" placeholder="Your email address"
											onfocus="this.placeholder = ''"
											onblur="this.placeholder = 'Email Address '" required=""
											type="email">
										<button class="btn sub-btn">
											<span class="lnr lnr-arrow-right"></span>
										</button>
									</div>
									<div class="mt-10 info"></div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div
					class="row footer-bottom d-flex justify-content-between align-items-center">
					<p class="col-lg-8 col-md-8 footer-text m-0">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						Copyright &copy;
						<script>
							document.write(new Date().getFullYear());
						</script>
						All rights reserved | This template is made with <i
							class="fa fa-heart-o" aria-hidden="true"></i> by <a
							href="https://colorlib.com" target="_blank">Colorlib</a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</p>
					<div class="col-lg-4 col-md-4 footer-social">
						<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
							class="fa fa-twitter"></i></a> <a href="#"><i
							class="fa fa-dribbble"></i></a> <a href="#"><i
							class="fa fa-behance"></i></a>
					</div>
				</div>
			</div>
		</footer>
		<!--================ End footer Area  =================-->

		<!--================Contact Success and Error message Area =================-->
		<div id="success" class="modal modal-message fade" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<i class="fa fa-close"></i>
						</button>
						<h2>Thank you</h2>
						<p>Your message is successfully sent...</p>
					</div>
				</div>
			</div>
		</div>

		<!-- Modals error -->

		<div id="error" class="modal modal-message fade" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<i class="fa fa-close"></i>
						</button>
						<h2>Sorry !</h2>
						<p>Something went wrong</p>
					</div>
				</div>
			</div>
		</div>
		<!--================End Contact Success and Error message Area =================-->




		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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
		<script src="ss/js/mail-script.js"></script>
		<script src="ss/vendors/counter-up/jquery.waypoints.min.js"></script>
		<script src="ss/vendors/counter-up/jquery.counterup.js"></script>
		<!-- contact js -->
		<script src="ss/js/jquery.form.js"></script>
		<script src="ss/js/jquery.validate.min.js"></script>
		<script src="ss/ss/js/contact.js"></script>
		<!--gmaps Js-->
		<script
			src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
		<script src="ss/js/gmaps.min.js"></script>
		<script src="ss/js/theme.js"></script>
</body>

</html>