function verificarDNI() {
    console.log('Verificando DNI...');
    var dni = document.getElementById('dniInput').value;
    console.log('DNI ingresado:', dni);
    obtenerUsuarioPorDocumento(dni)
        .then(data => {
            console.log('Respuesta del servicio:', data);
        })
        .catch(error => {
            console.error('Error del servicio:', error);
        });
}

function obtenerUsuarioPorDocumento(dni) {
    const url = `http://localhost:8080/api/usuario/documento/${dni}`;

    return fetch(url, {
        method: 'GET',
        mode: 'cors',
        headers: {
            'Content-Type': 'application/json',
        }
    })
        .then(response => {
            if (response.ok) {
                console.log("usuario encontrado!");
                return response.json();
            } else {
                throw new Error(`Error al obtener el usuario por documento (${response.status} ${response.statusText})`);
            }
        })
        .catch(error => {
            console.error('Error de red', error);
            throw error;
        });
}





