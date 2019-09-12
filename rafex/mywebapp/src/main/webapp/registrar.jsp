<html>
	<head>
		<title>Registrar Persona</title>
	</head>
	<body>
		<h1>Registro</h1>
		<form action="${pageContext.request.contextPath}/registroPersonas" method="post">
    		<label>Nombre:</label>        
    		<input type="text" name="nombre" />

			<label>Apellido Paterno:</label>        
    		<input type="text" name="apellidoPaterno" />
    
    		<label>Apellido Materno:</label>        
    		<input type="text" name="apellidoMaterno" />
    
    		<label>Edad:</label>        
    		<input type="number" name="edad" />
    

    
    		<input type="submit" name="submit" value="Enviar" />
		</form>
	</body>
</html>