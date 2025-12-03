<h2>CodeOfClarity Jobs Portal</h2>

<p><strong>A Simple Job Posting Web Application Built with Spring Boot & Thymeleaf</strong></p>

<h3>Overview</h3>
<p>
CodeOfClarity Jobs Portal is a beginner-friendly job management web application built using Java, Spring Boot, and Thymeleaf.
It allows users to:
</p>

<ul>
    <li>View all available job posts</li>
    <li>Add new job listings through a form</li>
    <li>Display job roles dynamically using a server-side template engine</li>
</ul>

<p>
This project demonstrates the core fundamentals of Spring MVC, dependency injection, model-view-controller architecture, and form handling in Spring Boot.
</p>

<h3>Features</h3>
<ul>
    <li> Add new job posts</li>
    <li> Display all available jobs</li>
    <li> Backend powered by Spring Boot</li>
    <li> Server-side rendering using Thymeleaf</li>
    <li> Fully responsive UI using HTML, CSS, Bootstrap</li>
    <li> Demonstrates CRUD fundamentals (in-memory storage version)</li>
</ul>

<h3>Tech Stack</h3>
<table>
<thead>
<tr>
<th>Layer</th>
<th>Technologies Used</th>
</tr>
</thead>

<tbody>
<tr>
<td>Backend</td>
<td>Java, Spring Boot (Spring MVC)</td>
</tr>

<tr>
<td>Frontend</td>
<td>HTML, CSS, Bootstrap, Thymeleaf</td>
</tr>

<tr>
<td>Database</td>
<td>In-memory Java Collection (ArrayList)</td>
</tr>
</tbody>
</table>

<h3>Project Structure</h3>

<pre>
src
 └── main
     ├── java
     │   └── com.smit.JobApp
     │       ├── controller     → Handles web requests
     │       ├── model          → JobPost data structure
     │       ├── repository     → Stores job posts
     │       └── service        → Business logic layer placeholder
     └── resources
         ├── templates          → Thymeleaf HTML UI
         └── static             → CSS/Assets
</pre>

<h3>How to Run the Project</h3>

<p><strong>Prerequisites:</strong></p>
<ul>
    <li>Java 17+</li>
    <li>Maven</li>
    <li>IDE (IntelliJ recommended)</li>
</ul>

<p><strong>Run the Application and open:</strong> http://localhost:8080</p>

<h3>Learning Outcomes</h3>

<p>During this project, the following concepts were practiced:</p>

<ul>
    <li>Spring Boot MVC architecture</li>
    <li>Controller-to-view communication using Model</li>
    <li>Handling forms with Spring & Thymeleaf</li>
    <li>Creating reusable UI components</li>
    <li>Understanding layered application design (Controller → Service → Repository → Model)</li>
</ul>
