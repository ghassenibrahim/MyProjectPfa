<!DOCTYPE html>
<head>
	<!-- templatemo 418 form pack -->
    <!-- 
    Form Pack
    http://www.templatemo.com/preview/templatemo_418_form_pack 
    -->
	<title>Login Two</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet" type="text/css">
	<link href="login/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="login/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="login/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
	<link href="login/css/bootstrap-social.css" rel="stylesheet" type="text/css">	
	<link href="login/css/templatemo_style.css" rel="stylesheet" type="text/css">	
	
	
	 <meta name="google-signin-client_id" content="3372296114-9t58msmunrlgdkmvjla70uccm9daj2kp.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
</head>
<body class="templatemo-bg-image-1">
	<div class="container">
		<div class="col-md-12">			
			<form class="form-horizontal templatemo-login-form-2" role="form" action="Connexion" method="post">
				<div class="row">
					<div class="col-md-12">
						<h1>Login </h1>
					</div>
				</div>
				<div class="row">
					<div class="templatemo-one-signin col-md-6">
				        <div class="form-group">
				          <div class="col-md-12">		          	
				            <label for="username" class="control-label">Email</label>
				            <div class="templatemo-input-icon-container">
				            	<i class="fa fa-user"></i>
				            	<input type="text" class="form-control" name="email" id="username" placeholder="">
				            </div>		            		            		            
				          </div>              
				        </div>
				        <div class="form-group">
				          <div class="col-md-12">
				            <label for="password" class="control-label">Password</label>
				            <div class="templatemo-input-icon-container">
				            	<i class="fa fa-lock"></i>
				            	<input type="password" class="form-control" name="pass" id="password" placeholder="">
				            </div>
				          </div>
				        </div>
				        <div class="form-group">
				          <div class="col-md-12">
				            <div class="checkbox">
				                <label>
				                  <input type="checkbox"> Remember me
				                </label>
				            </div>
				          </div>
				        </div>
				        <div class="form-group">
				          <div class="col-md-12">
				            <input type="submit" value="LOG IN" class="btn btn-warning">
				          </div>
				        </div>
				        <div class="form-group">
				          	<div class="col-md-12">
				        		<a href="ForgotPass" class="text-center">Cannot login?</a>
				       	 	</div>
				    	</div>
					</div>
					<div class="templatemo-other-signin col-md-6">
						<label class="margin-bottom-15">
							<a rel="nofollow" href="Accueil">Retour Vers Accueil</a> 
						</label>
						<a class="btn btn-block btn-social btn-facebook margin-bottom-15">
						    <i class="fa fa-facebook"></i> Sign in with Facebook
						</a>
						<a class="btn btn-block btn-social btn-twitter margin-bottom-15">
						    <i class="fa fa-twitter"></i> Sign in with Twitter
						</a>
						<a class="btn btn-block btn-social btn-google-plus" 
						 href="https://accounts.google.com/o/oauth2/v2/auth? response_type=code& client_id=3372296114-9t58msmunrlgdkmvjla70uccm9daj2kp.apps.googleusercontent.com&
						 scope=openid profile email& redirect_uri=http://localhost/Test22/verif.php">
						    <i class="fa fa-google-plus"></i> Sign in with Google
						</a>
					</div>   
				</div>				 	
		      </form>		      		      
		</div>
	</div>
</body>
</html>