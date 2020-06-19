<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../vendor/bootstrap/bootstrap.css">
    <title>Modifier</title>
</head>
<body class="bg-dark">
<!--HEADING-->
<h1 class="text-center font-weight-bold bg-light">Modifier</h1>

<main class="container">
    <form id="fomUp" action="" method="post">
        <div class="text-center alert-danger">
            <span id="errorSpan" class="text-danger"></span>
        </div>
        <div class="row p-5">
            <div class="col-6">
                <label for="nameInput" class="form-label">Joueur</label>
                <input type="text" class="form-control" id="nameInput">
            </div>
            <div class="col">
                <label for="scoreInput" class="form-label">Score</label>
                <div class="input-group">
                    <input id="scoreInput" type="number" class="form-control" aria-label="Score" aria-describedby="addon">
                    <span class="input-group-text" id="addon">points</span>
                </div>
            </div>
            <div class="row">
                <div class="text-center mt-5 col">
                    <a href="../" id="back" class="btn btn-outline-primary" title="Retour">Retour</a>
                </div>
                <div class="text-center mt-5 col">
                    <button id="update" type="submit" class="btn btn-outline-primary">Modifier</button>
                </div>
            </div>
        </div>
    </form>
</main>

<footer class="fixed-bottom bg-light">
    <div class="text-center text-info">© 2020 CocoCouq</div>
</footer>

<script src="../../public/vendor/axios/axios.js"></script>
<script src="../../public/assets/js/model.js"></script>
<script src="../../public/assets/js/update.js"></script>
<script src="../../public/vendor/bootstrap/bootstrap.js"></script>

</body>
</html>
