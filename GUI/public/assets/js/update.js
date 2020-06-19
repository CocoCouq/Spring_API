// API CONNECTION
const HOST = 'http://localhost:9090'
const LOCATION = '/Zone/GUI/public/Score/'
const SIZE_BASE_URL = HOST.length + LOCATION.length
const API = new Api(HOST)

// Where document loaded
document.addEventListener('DOMContentLoaded', function(event) {
    event.preventDefault()
    let id = window.location.toLocaleString().substr(SIZE_BASE_URL)

    document.getElementById('update').addEventListener('click', function (event) {
        const NAME_INPUT = document.getElementById('nameInput').value
        const SCORE = document.getElementById('scoreInput').value
        const FILTER_STR = /(^[a-zéèêëôœîïûüàáâæç'-]+\s*)$/i
        const FILTER_INT = /(^\d+$)/
        // FORM VERIFICATION
        if (NAME_INPUT != null && NAME_INPUT !== '' && FILTER_STR.test(NAME_INPUT)) {
            if (SCORE != null && SCORE !== 0 && FILTER_INT.test(SCORE)) {
                // SUBMIT
                API.updateScore({id:id, name:NAME_INPUT, score:SCORE})
                window.location.href('./')
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

    API.getById(id)
});



