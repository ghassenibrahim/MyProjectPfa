<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
    <title>Car ESSAT</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link href="e/e.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

    <link href="i/i.css" rel="stylesheet">
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
								<li><a href="Deconnexion" class="nav-link">D�connexion
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
                                <form class="form-horizontal templatemo-contact-form-1" role="form" action="Rating" methode="get">
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <h1 class="margin-bottom-15">Contrat</h1>

                                        </div>

                                        <label for="name" class="control-label">*Destinataire:<font color="red">
                                                ${c.getDispo().getCompte().getUser().getNom()}
                                                ${c.getDispo().getCompte().getUser().getPrenom()}</font></label> </br>
                                        <label for="name" class="control-label">*Email:<font color="red">
                                                ${c.getCompte().getEmail()}</font></label> </br> <label for="name"
                                            class="control-label">*Tel:<font color="red">
                                                ${c.getCompte().getUser().getTel()}</font></label> </br> <label
                                            for="name" class="control-label">*Service consulte :<font color="red">
                                                ${c.getDispo().getService().getLibelle()}</font></label>
                                        </br> <label for="name" class="control-label">*Description
                                            :<font color="red"> ${c.getDescription()}</font>
                                        </label> </br> <label for="name" class="control-label">*Adress du
                                            travaux:<font color="red"> ${c.getAddress()}</font>
                                        </label> </br> <label for="name" class="control-label">*Prix
                                            propose:<font color="red"> ${c.getPrix()}</font> dinars/heure
                                        </label> </br> <label for="name" class="control-label">*Date
                                            travaux:<font color="red"> ${c.getDate()}</font> *heure:<font color="blue">
                                                ${c.getTime()}</font>
                                        </label>
                                        <div class="form-group">
                                            <div class="col-md-12">

                                               
                                            </div>
                                            <button type="button" class="btn btn-danger" data-toggle="modal"
                                                data-target="#exampleModalCenter">
                                                Travaux Termin�</button>
                                            
                                                <!-- Modal -->
                                                <div class="modal fade" id="exampleModalCenter" tabindex="-1"
                                                    role="dialog" aria-labelledby="exampleModalCenterTitle"
                                                    aria-hidden="true">
                                                    <div class="modal-dialog modal-dialog-centered" role="document">

                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title" id="exampleModalLongTitle">Rate
                                                                    u provider here</h5>
                                                                <button type="button" class="close" data-dismiss="modal"
                                                                    aria-label="Close">
                                                                    <span aria-hidden="true">&times;</span>
                                                                </button>
                                                            </div>

                                                            <div class="modal-body">

                                                                <fieldset class="rating">
                                                                    <input type="radio" id="star5" name="rating"
                                                                        value="5" /><label class="full" for="star5"
                                                                        title="Awesome - 5 stars"></label>
                                                                    <input type="radio" id="star4half" name="rating"
                                                                        value="4 and a half" /><label class="half"
                                                                        for="star4half"
                                                                        title="Pretty good - 4.5 stars"></label>
                                                                    <input type="radio" id="star4" name="rating"
                                                                        value="4" /><label class="full" for="star4"
                                                                        title="Pretty good - 4 stars"></label>
                                                                    <input type="radio" id="star3half" name="rating"
                                                                        value="3 and a half" /><label class="half"
                                                                        for="star3half" title="Meh - 3.5 stars"></label>
                                                                    <input type="radio" id="star3" name="rating"
                                                                        value="3" /><label class="full" for="star3"
                                                                        title="Meh - 3 stars"></label>
                                                                    <input type="radio" id="star2half" name="rating"
                                                                        value="2 and a half" /><label class="half"
                                                                        for="star2half"
                                                                        title="Kinda bad - 2.5 stars"></label>
                                                                    <input type="radio" id="star2" name="rating"
                                                                        value="2" /><label class="full" for="star2"
                                                                        title="Kinda bad - 2 stars"></label>
                                                                    <input type="radio" id="star1half" name="rating"
                                                                        value="1 and a half" /><label class="half"
                                                                        for="star1half" title="Meh - 1.5 stars"></label>
                                                                    <input type="radio" id="star1" name="rating"
                                                                        value="1" /><label class="full" for="star1"
                                                                        title="Sucks big time - 1 star"></label> <input
                                                                        type="radio" id="starhalf" name="rating"
                                                                        value="half" /><label class="half"
                                                                        for="starhalf"
                                                                        title="Sucks big time - 0.5 stars"></label>
                                                                </fieldset>
                                                                <div>
                                                                    <button type="submit" class="btn btn-warning">Rate Now</button>
                                                                </div>
                                                               
                                                                <hr>

                                                                <button type="button" class="btn btn-danger"
                                                                    data-dismiss="modal">Close</button>
                                                               
                                                            </div>

                                                        </div>

                                                    </div>
                                                </div>
                                            
                                        </div>
                                    </div>
                                </form>
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
                                            document.write(new Date()
                                                .getFullYear());
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