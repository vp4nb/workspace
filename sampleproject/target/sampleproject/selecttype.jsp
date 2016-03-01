<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Info</title>
<script type = "text/javascript" 
         src = "http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<Script type="text/javascript">
//browser specific request created
var ajaxRequest;// The variable that makes Ajax possible!
var count=0;
function ajaxFunction(){
 try{
    
    // Opera 8.0+, Firefox, Safari
    ajaxRequest = new XMLHttpRequest();
 }catch (e){
 
    // Internet Explorer Browsers
    try{
       ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
    }catch (e) {
    
       try{
          ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
       }catch (e){
    
          // Something went wrong
          alert("Your browser broke!");
          return false;
       }
    }
 }
}

//create function for on change event
function getResults() {
 ajaxFunction();
 // Here processRequest() is the callback function.
 ajaxRequest.onreadystatechange = processRequest;
 var url = "select.enter?id=" + escape(document.getElementById("se_job").value);
 ajaxRequest.open("POST", url, true);
 ajaxRequest.send(null);
}
//process the return result
function processRequest() {
	   if (ajaxRequest.readyState == 4) {
	      if (ajaxRequest.status == 200) {
	         alert(ajaxRequest.responseText);
	      }
	   }
	}
		   
$(document).ready(function(){
		$("#se_job").onchange(function(){
			alert("abc");
			alert($("select").val());	
		})
		});		  

</Script>
</head>
<body bgcolor="blue">
<div align="center">
<img src="http://textinchurch.com/wp-content/uploads/2015/08/Enter-Contact-Info2.jpg" alt="Enter info" width="300" height="142" title="Information">
<br/><h1><p style="color:red">Select job type</p></h1>
</div>
<div style="color:white"align="center">
<table>

<tr>	<td>	<p>Job: 
		</td>
		<td>	<select id="se_job" name="job" onchange="getResults()"><option value="Manager">Manager</option>
				<option value="asst.Manager">asst.Manager</option>
				<option value="Sr.employee">Sr.employee</option>
				<option value="jr.employee">jr.employee</option>
				<option value="cleark">cleark</option>
				</select>
		</td>	</p>
</tr>
</table>

</div>
</body>
</html>