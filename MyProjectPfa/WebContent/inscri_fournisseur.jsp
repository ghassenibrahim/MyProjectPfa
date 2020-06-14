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
								<li><a href="index.html" class="nav-link">Home</a></li>
								<%
									Object compte = session.getAttribute("compte");

									if (compte == null) {
								%>
								<li><a href="Connexion">Se Connecter</a></li>
								<li><a
									href="Ajout_Demandeur">Inscri</a></li>
								<li><a
									href="Ajout_Fournisseur">Devenir
										Bricoleur</a></li>
								<%
									} else {
								%>
								<li><a href="Mon profil" class="nav-link">${compte.getUser().getPrenom()}
										${compte.getUser().getNom()}</a></li>
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
                            <div class="col-lg-8 col-md-8">
                                <h1 class="typo-list">INFORMATIONS PERSONNELLES</h1>
                                <form  action="Ajout_Fournisseur" method="post">
                                    <div class="mt-10">
                                        <input type="text" name="prenom" placeholder="First Name"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'First Name'"
                                            required class="single-input">
                                    </div>
                                    <div class="mt-10">
                                        <input type="text" name="nom" placeholder="Last Name"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'Last Name'"
                                            required class="single-input">
                                    </div>
                                    <div class="mt-10">
                                        <input type="email" name="email" placeholder="Email address"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email address'"
                                            required class="single-input">
                                    </div>
                                    <div class="mt-10">
                                        <input type="text" name="password" placeholder="Password"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'Password'"
                                            required class="single-input">
                                    </div>
                                    <div class="mt-10">
                                         <input type="date" name="date" placeholder="date"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'date'" required
                                            class="single-input">
                                    </div>

                                    <div class="input-group-icon mt-10">
                                        <div class="icon">
                                            <i class="fa fa-globe" aria-hidden="true"></i>
                                        </div>
                                        <input type="text" name="pays" placeholder="Country"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'Country'"
                                            required class="single-input">
                                    </div>
                                    <div class="input-group-icon mt-10">
                                        <div class="icon">
                                            <i class="fa fa-plane" aria-hidden="true"></i>
                                        </div>
                                        <input type="text" name="city" placeholder="City"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'City'" required
                                            class="single-input">
                                    </div>
                                    <div class="input-group-icon mt-10">
                                        <div class="icon">
                                            <i class="fa fa-globe" aria-hidden="true"></i>
                                        </div>
                                        <input type="text" name="tel" placeholder="Phone"
                                            onfocus="this.placeholder = ''" onblur="this.placeholder = 'Phone'" required
                                            class="single-input">
                                    </div>

                                    <div class="button-group-area mt-40">

                                        <button type="submit" class="genric-btn info circle arrow">Suivant<span class="lnr lnr-arrow-right"></span>
                                        </button>
                                        <a href="Accueil" class="genric-btn danger circle arrow">
											Annuler<span class="lnr lnr-arrow-right"></span></a>

                                    </div>
                                </form>
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
</body>

</html>