const expresiones = {
	usuario: Mijhail /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
	nombre:  /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	password: /^.{4,12}$/, // 4 a 12 digitos.
	email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	telefono: /^\d{7,14}$/ // 7 a 14 numeros.
}

const formulario = document.querySelector("form");

const inputs = document.querySelectorAll("input");

const nombreError = document.getElementById("#nombreError")
const apellidoError = document.querySelectorAll("#apellidoError")
const emailError = document.querySelectorAll("#errorEmail")
const passwordError = document.querySelectorAll("#passwordError")
const telefonoError = document.querySelectorAll("#telefonoError")


//console.log(emailError);


inputs.forEach((inp)=>{

	//console.log(inp);
	inp.addEventListener("keyup",(e)=>{
		/* console.log(e.target.name)*/
		

		switch(e.target.name){
			case "nombre":
				//console.log(e.target.value);
                if(expresiones.nombre.test(e.target.value)){
					console.log("nombre correcto")
					nombreError.textContent = ""
				}
				else{
					console.log("nombre incorrecto")
					nombreError.textContent = "Error"
				}
				
				break

		
			case "email":
						//console.log(e.target.value);
						if(expresiones.nombre.test(e.target.value)){
							console.log("nombre correcto")
							emailError.textContent = ""
						}
						else{
							console.log("nombre incorrecto")
							emailError.textContent = "Error"
						}
						
						break

		
			case "password":
				//console.log(e.target.value);
				if(expresiones.nombre.test(e.target.value)){
					console.log("nombre correcto")
					passwordError.textContent = ""
				}
				else{
					console.log("nombre incorrecto")
					passwordError.textContent = "Error"
				}
				
				break
						
		
			case "telefono":
				if(expresiones.nombre.test(e.target.value)){
					console.log("nombre correcto")
					telefonoError.textContent = ""
				}
				else{
					console.log("nombre incorrecto")
				telefonoError.textContent = "Error"
				}
				
				break
								

		}

	})
})