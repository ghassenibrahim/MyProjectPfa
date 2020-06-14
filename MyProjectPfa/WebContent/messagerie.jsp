<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
	<title>Car ESSAT</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

	<link href="https://fonts.googleapis.com/css?family=DM+Sans:300,400,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="fonts/icomoon/style.css">

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap-datepicker.css">
	<link rel="stylesheet" href="css/jquery.fancybox.min.css">
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
	<link rel="stylesheet" href="css/aos.css">

	<!-- MAIN CSS -->
	<link rel="stylesheet" href="css/style.css">
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

	<link rel="stylesheet" href="WebContent/ss/vendors/linericon/style.css">
	<link rel="stylesheet" href="ss/css/font-awesome.min.css">
	<link rel="stylesheet" href="ss/vendors/owl-carousel/owl.carousel.min.css">
	<link rel="stylesheet" href="ss/vendors/lightbox/simpleLightbox.css">
	<link rel="stylesheet" href="ss/vendors/nice-select/css/nice-select.css">
	<link rel="stylesheet" href="ss/vendors/animate-css/animate.css">
	<link rel="stylesheet" href="ss/css/style.css">
	<link rel="stylesheet" href="ss/css/responsive.css">
	<meta name="keywords" content="" />
	<meta name="description" content="" />

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet" type="text/css">
	<link href="login/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="login/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="login/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
	<link href="login/css/bootstrap-social.css" rel="stylesheet" type="text/css">
	<link href="login/css/templatemo_style.css" rel="stylesheet" type="text/css">

	<meta name="robots" content="noindex">
	<link rel="shortcut icon" type="image/x-icon"
		href="//production-assets.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico" />
	<link rel="mask-icon" type=""
		href="//production-assets.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg"
		color="#111" />
	<link rel="canonical" href="https://codepen.io/emilcarlsson/pen/ZOQZaV?limit=all&page=74&q=contact+" />
	<link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700,300' rel='stylesheet'
		type='text/css'>

	<script src="https://use.typekit.net/hoy3lrg.js"></script>

	<link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css'>
	<link rel='stylesheet prefetch'
		href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.2/css/font-awesome.min.css'>


	<link rel="stylesheet" href="a/4.css">
</head>

<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">


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



						<nav class="site-navigation text-right ml-auto d-none d-lg-block" role="navigation">
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
			<div class="ftco-cover-1 overlay innerpage" style="background-image: url('images/hero_2.jpg')">
				<div class="container">
					<div class="section-top-border">
						<div class="row">
							<div class="col-md-12">
								<div id="frame">
									<div id="sidepanel">
										<div id="profile">
											<div class="wrap">
												<img id="profile-img"
													src="images/fournisseur/${compte.getUser().getImage()}.jpg " 
													class="online" alt="" />
												<p>${compte.getUser().getPrenom()}
													${compte.getUser().getNom()}</p>
												<i class="fa fa-chevron-down expand-button" aria-hidden="true"></i>
												<div id="status-options">
													<ul>
														<li id="status-online" class="active"><span
																class="status-circle"></span>
															<p>Online</p>
														</li>
														<li id="status-away"><span class="status-circle"></span>
															<p>Away</p>
														</li>
														<li id="status-busy"><span class="status-circle"></span>
															<p>Busy</p>
														</li>
														<li id="status-offline"><span class="status-circle"></span>
															<p>Offline</p>
														</li>
													</ul>
												</div>
												<div id="expanded">
													<label for="twitter"><i class="fa fa-facebook fa-fw"
															aria-hidden="true"></i></label> <input name="twitter"
														type="text" value="mikeross" /> <label for="twitter"><i
															class="fa fa-twitter fa-fw" aria-hidden="true"></i></label>
													<input name="twitter" type="text" value="ross81" /> <label
														for="twitter"><i class="fa fa-instagram fa-fw"
															aria-hidden="true"></i></label> <input name="twitter"
														type="text" value="mike.ross" />
												</div>
											</div>
										</div>
										<div id="search">
											<label for=""><i class="fa fa-search" aria-hidden="true"></i></label> <input
												type="text" placeholder="Search contacts..." />
										</div>
										<div id="contacts">
											<ul>

												<c:forEach items="${list}" var="liste">
													<c:choose>

														<c:when test="${liste.getSender().getId()==id}">
															<li class="contact">
																<div class="wrap">
																	<c:choose>

																		<c:when
																			test="${liste.getReceiver().getCnx()==1}">
																			<span class="contact-status online"> </span>
																		</c:when>
																		<c:otherwise>
																			<span class="contact-status busy"> </span>
																		</c:otherwise>
																	</c:choose>
																	<img src="images/fournisseur/${liste.getReceiver().getUser().getImage()}.jpg"
																		width="50%" height="50" alt="" />
																	<div class="meta">
																		<p class="name">
																			${liste.getReceiver().getUser().getPrenom()}
																			${liste.getReceiver().getUser().getNom()}
																		</p>
																		<c:choose>

														<c:when test="${liste.getReceiver().getId()==id && liste.getReceiveread()==0}">
															<a href="Messagerie?id=${liste.getReceiver().getId()}">
															<p><font color="black">${liste.getMessage()}</font></p>
															</a>
														</c:when>
														
														<c:otherwise>
															<a href="Messagerie?id=${liste.getReceiver().getId()}">
																<p class="preview">${liste.getMessage()}</p>
															</a>
														</c:otherwise>
													</c:choose>
										</div>
									</div>
									</li>
									</c:when>
									<c:otherwise>
										<li class="contact">

											<div class="wrap">
												<c:choose>

													<c:when test="${liste.getReceiver().getCnx()==1}">
														<span class="contact-status online"> </span>
													</c:when>
													<c:otherwise>
														<span class="contact-status busy"> </span>
													</c:otherwise>
												</c:choose>
												<img src="images/fournisseur/${liste.getSender().getUser().getImage()}.jpg "width="50%" height="50"
													alt="" />
												<div class="meta">
													<p class="name">
														${liste.getSender().getUser().getPrenom()}
														${liste.getSender().getUser().getNom()}</p>

													<c:choose>

														<c:when test="${liste.getReceiver().getId()==id && liste.getReceiveread()==0}">
															<a href="Messagerie?id=${liste.getSender().getId()}">
															<p><font color="black">${liste.getMessage()}</font></p>
															</a>
														</c:when>
														
														<c:otherwise>
															<a href="Messagerie?id=${liste.getSender().getId()}">
																<p class="preview">${liste.getMessage()}</p>
															</a>
														</c:otherwise>
													</c:choose>
													
												</div>
											</div>
										</li>

									</c:otherwise>
									</c:choose>


									</c:forEach>
									</ul>
								</div>
								<div id="bottom-bar">
									<button id="addcontact">
										<i class="fa fa-user-plus fa-fw" aria-hidden="true"></i> <span>Add
											contact</span>
									</button>
									<button id="settings">
										<i class="fa fa-cog fa-fw" aria-hidden="true"></i> <span>Settings</span>
									</button>
								</div>
							</div>
							<div class="content">
								<div class="contact-profile">

									<img src="images/fournisseur/${c1.getUser().getImage()}.jpg" width="50%" height="50"alt="" />
									<p style="color: black">${c1.getUser().getPrenom()}
										${c1.getUser().getNom()}</p>

									<div class="social-media">
										<i class="fa fa-facebook" aria-hidden="true"></i> <i class="fa fa-twitter"
											aria-hidden="true"></i> <i class="fa fa-instagram" aria-hidden="true"></i>
									</div>
								</div>
								<div class="messages">
									<ul>
										<c:forEach items="${c}" var="c">
											<c:choose>
												<c:when test="${c.getSender().getId()==id}">
													<li class="replies"><img
															src="images/fournisseur/${c.getSender().getUser().getImage()}.jpg "
															alt="" />
														<p>${c.getMessage()}</p> </br> </br> </br> <a>envoye
															le:${c.getDate()}</a>

													</li>
												</c:when>
												<c:otherwise>
													<li class="sent"><img
															src="images/fournisseur/${c.getSender().getUser().getImage()}.jpg"width="50%" height="50"
															alt="" />
														<p>${c.getMessage()}</p> </br> <a>envoye le :${c.getDate()}</a>
													</li>


												</c:otherwise>
											</c:choose>


										</c:forEach>
									</ul>
								</div>
								<form action="Send_msg4" method="GET" >
								<div class="message-input">
									<div class="wrap">
										<input type="text" name ="message" placeholder="Write your message..." /> <i
											class="fa fa-paperclip attachment" aria-hidden="true"></i>
										<button class="submit">
											<i class="fa fa-paper-plane" aria-hidden="true"></i>
										</button>
									</div>
								</div>
								</form>
							</div>
						</div>
						<script
							src='//production-assets.codepen.io/assets/common/stopExecutionOnTimeout-b2a7b3fe212eaa732349046d8416e00a9dec26eb7fd347590fbced3ab38af52e.js'></script>
						<script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>
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