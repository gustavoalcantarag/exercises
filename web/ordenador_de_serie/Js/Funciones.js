var serie_numeros = []; // "Array" en donde se almacenarán los datos ingresados

    function ingresar() { // Función del botón "Ingresar" en el html
    	var valor = parseInt(document.getElementById("numero").value); // Capturar el número ingresado en el input
        // Se añadió la función "parseInt" para que convierta el valor ingresado en número entero
        var contador = 0; // Variable para comprobar igualdad de los numeros ingresados

        for(var i=0; i<serie_numeros.length; i++){ // Bucle de los numeros ingresados para verificar igualdad
            if (valor==serie_numeros[i]) { // Condición para comparar datos ingresados
                contador++; // Variable aumentado en 1 si se cumple la igualdad de números ingresados
            }
        }

        if (contador == 0) { // Condición para verificar si el número será ingresado
            serie_numeros.push(valor); // El metodo "push" añade los valores ingresados permitidos al "array"
        }
        else{
            alert("Por favor ingrese un número distinto") // Mensaje de alerta por si no cumple la condición anterior
        }

        numero.value = ""; // Limpia el input después de presionar el botón "Ingresar"
        var texto = ""; // Declaro la variable "texto" para mostrar los datos almacenados en el array

        for(var i=0; i<serie_numeros.length; i++){ // Bucle de los números ingresados 
            texto += serie_numeros[i] + ", "; // Almacenar la cadena de texto de los numeros válidos ingresados
        }

    document.getElementById('Mostrar_conjunto').innerHTML = texto; // Mostrar la variable texto en el div del html
    return serie_numeros; //Devuelve el "array" en donde están almacenados los números ingresados
    }

    function ordenar() { // Función del botón "Ordenar" en el html
        serie_numeros = ingresar(); // Volver a ejecutar la funcion anterior
        serie_numeros.pop(); // El método "pop" elimina el último valor del "array" ya que al limpiar el input, queda un valor no válido

       // Para el ordenamiento ascendente de los números ingresados, se aplica el "Método de ordenamiento burbuja"
	   for(var i=0; i<serie_numeros.length-1; i++) // Se recorre los valores hasta n-1
            for(var j=0; j<serie_numeros.length-i-1; j++)  // Se recorre los valores hasta n-i-1
                if (serie_numeros[j]>serie_numeros[j+1]) { // Comparación
                    var n_auxiliar = serie_numeros[j];  // Se guarda el número mayor 
                    serie_numeros[j] = serie_numeros[j+1]; // Se guarda el número menor
                    serie_numeros[j+1] = n_auxiliar; // Se asigna el lugar correspondiente
                }
            
    document.getElementById('Mostrar_orden').innerHTML = serie_numeros; // Mostrar la variable texto en el div del html
    }

    function limpiar() { // Función para limpiar los datos mostrados
    document.getElementById('Mostrar_conjunto').innerHTML = "";
    document.getElementById('Mostrar_orden').innerHTML = "";
    serie_numeros = [];
    }











