# M4_Grupo2_2023
Grupo 2 del módulo 4 - Máster en DevOps &amp; Cloud Computing - Joaquín Cabrera y Jordi Mayta

<a name="readme-top"></a>
<!---->




<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#acerca-del-projecto">Acerca del Projecto</a>
      <ul>
        <li><a href="#construido-con">Construido con</a></li>
      </ul>
    </li>
    <li>
      <a href="#generalidades">Generalidades</a>
      <ul>
        <li><a href="#prerequisitos">Prerequisitos</a></li>
      </ul>
    </li>
    <li>
      <a href="#características-de-las-pruebas">Características de las pruebas</a>
      <ul>
        <li><a href="#darse-de-alta-en-la-tienda">Darse de alta en la Tienda</a></li>
        <li><a href="#iniciar-sesión-en-la-tienda">Iniciar Sesión en la Tienda</a></li>
        <li><a href="#navegar-por-las-categorías-de-productos">Navegar por las Categorías de Productos</a></li>
        <li><a href="#agregar-productos-al-carrito">Agregar Productos al Carrito</a></li>
        <li><a href="#remover-un-producto-del-carrito">Remover un Producto del Carrito</a></li>
        <li><a href="#completar-el-pedido">Completar el Pedido</a></li>
      </ul>
    </li>
  </ol>
</details>



<!-- ACERCA DEL PROYECTO -->
## Acerca del Projecto

El proyecto integra seis pruebas automatizadas de la tienda en línea https://www.demoblaze.com, con la intención de practicar e internalizar los conceptos del módulo de Software Testing del Master en DevOps y Cloud Computing. Como objetivos específicos de la actividad se tuvieron:
    <li>Aprender a crear un proyecto de automatización web con tecnología Maven.</li>
    <li>Aprender a respetar el Patrón AAA durante la creación de la prueba automática.</li>
    <li>Aprender a ejecutar la prueba de forma local y por comandos Maven.</li>
    <li>Aprender a utilizar el patrón de diseño de objetos en pruebas automatizadas. Aprender a utilizar correctamente el lenguaje Gherkin.</li>


<p align="right">(<a href="#readme-top">de vuelta al inicio</a>)</p>


<!-- CONSTRUIDO CON -->
### Construido con

Este proyecto emplea el lenguaje de programación Java y las herramientas del Framework Serenity BDD. Adicionalmente, se utiliza Maven como herramienta de automatización de la construcción del proyecto a través del concepto e implementación de un modelo de objeto de proyecto (POM por las siglas en inglés). 
Por otra parte, el entorno de programación es IntelliJ IDEA y la descripción de los escenarios de prueba se realizó con el Framework Cucumber en Gherkin para facilitar la documentación y extender su comprensión a usuarios no técnicos.

<p align="right">(<a href="#readme-top">de vuelta al inicio</a>)</p>



<!-- GENERALIDADES -->
## Generalidades

### Prerequisitos
Fueron instaladas I configuradas las últimas versiones de las siguientes herramientas y pluggins.
<li> Java </li>
<li> Intellij IDEA.(Community Edition) </li>
<li> Maven </li>
<li> Git </li>
<li> Drivers del navegador Chrome </li>
<li> jUnit  </li>
<li> Assertj  </li>
<li> Cucumber </li>

<p align="right">(<a href="#readme-top">de vuelta al inicio</a>)</p>

<!-- CARACTERÍSTICAS DE LAS PRUEBAS -->
## Características de las Pruebas

### Darse de alta en la Tienda
En esta prueba se clica la el enlace de "Sign up" situado en el menú superior del sitio de la tienda lo que despliega una ventana modal. En este punto debe llenarse la información del nuevo usuario y su password. Seguidamente se clica en el botón "Sign up", lo que acabará por generar una alerta de con la leyenda "Sign up successful" para el nuevo usuario si la información suministrada es la correcta, y el usuarion no está previamente registrado y una alerta de excepcion en caso contrario con la leyenda "This user already exist".
<p>Para este escenario sigue la siguiente narrativia utilizada en Gherkin</> 

Scenario: User Sign Up at Product Store website

Given Francisco wants to sign up at the website using username and password

When to sign up he uses 'a random username' and 'devopsm4g2' as password

Then he should see 'Welcome m4_grupo2' on the SigUp Results Page once Signed

### Iniciar Sesión en la Tienda
En esta prueba se clica la el enlace de "Log in" situado en el menú superior del sitio de la tienda lo que despliega una ventana modal. En este punto debe llenarse la información de usuario y password. Seguidamente se clica en el botón "Login", lo que acabará por generar un mensaje de bienvenida para el usuario si la información suministrada es la correcta y una alerta de excepcion en caso contrario.
<p>Para este escenario sigue la siguiente narrativia utilizada en Gherkin</> 

Scenario: User Login at Product Store website

Given Francisco wants to log in at the website using username and password

When to login he uses 'm4_grupo2' as the username and 'devopsm4g2' as password

Then he should see 'Welcome m4_grupo2' on the Login Results Page once Logged
  

### Navegar por las Categorías de Productos
En esta prueba se inicia clicando la categoría "Phones", seguidamente se clica la categoría "Laptops" y por último la categoría "Monitors". Para verificar que se ha navegado correctamente durante la navegación de cada categoría se agrega el nombre del primer item desplegado en una array que luego se compara con un array que cuenta con los nombres de dichos elementos, el cual fue previamente inicializado con los strings correspondientes.
<p>Para este escenario sigue la siguiente narrativia utilizada en Gherkin</>

Scenario: User clicks every category present at Product Store website

Given Francisco wants to check every category

When Francisco clicks on every category one by one to see the products

Then he can check the stock and see the first product

### Agregar Productos al Carrito
En este escenario se reutiliza parte del código del la función de navegar por las categorías de productos para ir a las dos primeras y en ellas selecionar los productos requerido que se quieren agregar al carrito. Se verifica el correcto funcionamiento comparando un array que en cada seleción agrega el nombre del producto selecionado con una array previamente inicializado con los strings que hacen referencia a los productos requeridos.
<p>Para este escenario sigue la siguiente narrativia utilizada en Gherkin</>

Scenario: User clicks the first two categories present at Product Store website and selects three products

Given Francisco wants to add three products to the cart

When Francisco clicks over the category and select one by one the products

Then Francisco navigates to the cart page and verify that the three products are there

### Remover un Producto del Carrito
Para este escenario se reutiliza parte del código de agregar productos al carrito para tener luego en la cesta de compra el elemento que se requiere remover. Para poder verificar que se ha removido el producto correctamente se obtiene el monto total de la compra al momento de finalizar la inclusión de productos en el carrito y luego nuevamente se obtiene el monto a pagar al finalizar la remoción del producto de la cesta de compra. Si ambos momentos difieren en monto, esto indica la correcta eliminación del producto de la lista en el carrito.
<p>Para este escenario sigue la siguiente narrativia utilizada en Gherkin</>
 
Scenario: Francisco navigates to Store Cart page and removes one product

Given Francisco has already items on the cart and wants to remove one products

When Francisco navigates to the cart page and remove one product

Then Francisco verify that the 'product' is successfully removed

### Completar el Pedido
Para este último escenario, se revisa el carrito de compras (clicando en el enlace del menú superior del sitio de la tienda), se clica en el botón "Place Order", se rellena la información del cliente (Nombre, País, Ciudad) junto con la información de pago (número de tarjeta, mes y año de vencimiento), y finalmente se clica en el botón "Purchase". Si se llenó la información de forma adecuada, se desplegará un mensaje con la información de la compra (ID, Monto, Nombre del cliente, Número de tarjeta, y Fecha de realización de la orden). En caso contrario se despliega una alerta de excepción solicitantdo la información faltante.
<p>Para este escenario sigue la siguiente narrativia utilizada en Gherkin</>

Scenario: Francisco needs to review his cart, place the order and pay

Given Francisco navigates to his cart

When Francisco reviews his order

Then Finally Francisco confirms his order and pays

<p align="right">(<a href="#readme-top">de vuelta al inicio</a>)</p>

