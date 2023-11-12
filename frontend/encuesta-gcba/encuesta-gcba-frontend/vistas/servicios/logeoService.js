async function obtenerUsuarioPorDocumento(dni) {
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
                return response.json();
            } else {
                throw new Error(`Error al obtener el usuario por documento (${response.status} ${response.statusText})`);
            }
        })
        .catch(error => {
            console.error('Error de red al obtener el usuario por documento:', error);
            throw error;
        });
}


function verificarDNI() {
    var dni = document.getElementById('dniInput').value;
    obtenerUsuarioPorDocumento(dni)
        .then(data => {
            console.log('Respuesta del servicio:', data);
            //acá me redirije al formulario si encontró usuario
            window.location.href = 'formulario.html';
        })
        .catch(error => {
            console.error('Error del servicio:', error);
            alert('Usuario no encontrado. Verifica el DNI e intenta nuevamente.');
        });
}


