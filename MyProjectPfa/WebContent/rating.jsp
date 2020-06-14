
<!DOCTYPE html>
<html>
<head>
<link href="e/e.css" rel="stylesheet">


</head>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="i/i.css" rel="stylesheet">
</head>
<body>

	<div class="container">
		<h2>Modal Example</h2>
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
			data-target="#myModal">Open Modal</button>

		<!-- Modal -->
		<form action="Rating" methode="get">
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">
				
					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Rating u provider here</h4>
						</div>


						<fieldset class="rating">
							<input type="radio" id="star5" name="rating" value="5" /><label
								class="full" for="star5" title="Awesome - 5 stars"></label> <input
								type="radio" id="star4half" name="rating" value="4 and a half" /><label
								class="half" for="star4half" title="Pretty good - 4.5 stars"></label>
							<input type="radio" id="star4" name="rating" value="4" /><label
								class="full" for="star4" title="Pretty good - 4 stars"></label>
							<input type="radio" id="star3half" name="rating"
								value="3 and a half" /><label class="half" for="star3half"
								title="Meh - 3.5 stars"></label> <input type="radio" id="star3"
								name="rating" value="3" /><label class="full" for="star3"
								title="Meh - 3 stars"></label> <input type="radio"
								id="star2half" name="rating" value="2 and a half" /><label
								class="half" for="star2half" title="Kinda bad - 2.5 stars"></label>
							<input type="radio" id="star2" name="rating" value="2" /><label
								class="full" for="star2" title="Kinda bad - 2 stars"></label> <input
								type="radio" id="star1half" name="rating" value="1 and a half" /><label
								class="half" for="star1half" title="Meh - 1.5 stars"></label> <input
								type="radio" id="star1" name="rating" value="1" /><label
								class="full" for="star1" title="Sucks big time - 1 star"></label>
							<input type="radio" id="starhalf" name="rating" value="half" /><label
								class="half" for="starhalf" title="Sucks big time - 0.5 stars"></label>
						</fieldset>
						<div>
							<button type="submit">Rate Now</button>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Annuler</button>
						</div>

					</div>
				
			</div>
		</div>
</form>
	</div>

</body>
</html>
