<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="vendor/bootstrap/bootstrap.css">
    <title>Accueil</title>
</head>
<body class="bg-dark">
    <!--HEADING-->
    <h1 class="text-center font-weight-bold bg-light">Scores</h1>

    <main class="">
        <!--NAVIGATION-->
        <ul class="nav nav-tabs" id="myTab" role="tablist">
            <li class="nav-item" role="presentation">
                <a class="nav-link active bg-light" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true" title="Accueil">Accueil</a>
            </li>
            <li class="nav-item" role="presentation">
                <a class="nav-link bg-light" id="scores-tab" data-toggle="tab" href="#scores" role="tab" aria-controls="scores" aria-selected="false">Scores</a>
            </li>
            <li class="nav-item" role="presentation">
                <a class="nav-link bg-light" id="new-tab" data-toggle="tab" href="#new" role="tab" aria-controls="new" aria-selected="false">Ajouter</a>
            </li>
        </ul>
        <div class="tab-content bg-light" id="myTabContent">

            <!--ABOUT-->
            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                <h2 class="text-center">Bienvenue</h2>

                <section class="text-center mt-5">
                    <article>
                        Ce site reprend la création d'une API avec SpringBoot.
                    </article>
                    <article>
                        L'objectif et simplement de lier une interface simple pour en verifier le comportement.
                    </article>
                    <article class="small text-danger m-4 p-5">
                        Je vous souhaite une bonne visite, n'oubliez pas d'installer la base de donnée.
                    </article>
                </section>
            </div>

            <!--SCORES-->
            <div class="tab-pane fade" id="scores" role="tabpanel" aria-labelledby="scores-tab">
                <table class="table table-responsive">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Score</th>
                            <th scope="col">Nom</th>
                        </tr>
                    </thead>
                    <tbody id="bodyTable">

                    </tbody>
                </table>
            </div>

            <!--ADD-->
            <div class="tab-pane fade" id="new" role="tabpanel" aria-labelledby="new-tab">
                <form id="fomAdd" action="" method="post">
                    <div class="text-center alert-danger">
                        <span id="errorSpan" class="text-danger"></span>
                    </div>
                    <div class="row p-5">
                        <div class="col-6">
                            <label for="nameInput" class="form-label">Joueur</label>
                            <input type="text" class="form-control" id="nameInput" placeholder="Prénom">
                        </div>
                        <div class="col">
                            <label for="scoreInput" class="form-label">Score</label>
                            <div class="input-group">
                                <input id="scoreInput" type="number" class="form-control" placeholder="0" aria-label="Score" aria-describedby="addon">
                                <span class="input-group-text" id="addon">points</span>
                            </div>
                        </div>
                        <div class="text-center mt-5">
                            <button id="add" type="submit" class="btn btn-outline-primary">Ajouter</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </main>

    <footer class="fixed-bottom bg-light">
        <div class="text-center text-info">© 2020 CocoCouq</div>
    </footer>

    <script src="vendor/axios/axios.js"></script>
    <script src="./assets/js/model.js"></script>
    <script src="./assets/js/app.js"></script>
    <script src="vendor/bootstrap/bootstrap.js"></script>

</body>
</html>
