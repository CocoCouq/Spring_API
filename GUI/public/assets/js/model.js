class Api {
    // Constructor
    constructor(baseUrl) {
        this.BASE_URL = baseUrl
    }

    // Get all scores
    getList() {
        axios.get(`${this.BASE_URL}/Scores`)
            .then(response => {
                // console.log(response)
                document.getElementById('bodyTable').innerHTML = ''
                // For each score in response
                response.data.forEach(oneScore => {
                    let content = `<tr>
                                        <td>
                                            <div class="btn-group btn-group-sm" role="group" aria-label="Basic example">
                                                <a href="./Score/${oneScore.id}" title="Détails" class="btn btn-primary">Modifier</a>
                                                <button type="button" class="btn btn-danger" onclick="API.deleteScore({id:${oneScore.id}})">Supprimer</button>
                                            </div>
                                        </td>
                                        <td>${oneScore.score}</td>
                                        <td>${oneScore.name}</td>
                                   </tr>`
                    document.getElementById('bodyTable').innerHTML += content
                })
            })
            .catch(error => {
                console.log(error)
            })
    }

    // Add new score
    addScore(data) {
        axios.post(`${this.BASE_URL}/Scores`, data)
            .then((response) => {
                // console.log(response)
            })
            .catch(error => {
                console.log(error)
            })
    }

    // Get by id
    getById(id) {
        axios.get(`${this.BASE_URL}/Scores/${id}`)
            .then(response => {
                // console.log(response)
                document.getElementById('nameInput').value = response.data.name
                document.getElementById('scoreInput').value = response.data.score
            })
            .catch(error => {
                console.log(error)
            })
    }

    // Delete by id
    deleteScore(id) {
        axios.post(`${this.BASE_URL}/Scores/delete`, id)
            .then(response => {
                // console.log(response)
                this.getList()
            })
            .catch(error => {
                console.log(error)
            })
    }

    // Update by id
    updateScore(id) {
        axios.post(`${this.BASE_URL}/Scores/Update`, id)
            .then(response => {
                console.log(response)
            })
            .catch(error => {
                console.log(error)
            })
    }
}
