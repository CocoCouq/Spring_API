// API CONNECTION
const HOST = 'http://localhost:9090'
const API = new Api(HOST)

// Where document loaded
document.addEventListener('DOMContentLoaded', function() {
    API.getList()
});

// On Submit NEW SCORE
document.getElementById('fomAdd').addEventListener('submit', function (event) {
    // Form values & Regex filters
    const NAME_INPUT = document.getElementById('nameInput').value
    const SCORE = document.getElementById('scoreInput').value
    const FILTER_STR = /(^[a-zéèêëôœîïûüàáâæç'-]+\s*)$/i
    const FILTER_INT = /(^\d+$)/

    // FORM VERIFICATION
    if (NAME_INPUT != null && NAME_INPUT !== '' && FILTER_STR.test(NAME_INPUT)) {
        if (SCORE != null && SCORE !== 0 && FILTER_INT.test(SCORE)) {
            // SUBMIT
            API.addScore({'name': NAME_INPUT, 'score': SCORE})
            document.getElementById('errorSpan').innerText = 'AJOUTÉ'
        }
        else {
            event.preventDefault()
            document.getElementById('errorSpan').innerText = 'Pas de zéro'
        }
    }
    else {
        event.preventDefault()
        document.getElementById('errorSpan').innerText = 'Juste un nom'
    }
})




