$(document).ready(function() {

	$(".para1").click(function () {

		$(".para2").toggle();

	});
// added to test spotify
	
var apiurl = "https://accounts.spotify.com/api/token";
var clientid="6c605745c1834d6b8f1623949030d650";
var clientsecret="46ecef29129c4543a2a8dd0ca497b734";

 //var authHeader = $.base64.encode(clientid+":"+clientsecret);
 var authHeader = btoa(clientid+":"+clientsecret);
$.ajax({
	url: apiurl,
	 method: "POST",
	  data: "grant_type=client_credentials",
	 beforeSend: function (xhr) {
        xhr.setRequestHeader("Authorization", "Basic " + authHeader);
		}
}).done(function(data){
	console.log(data);
	alert(data);
});
	
	// end add

});
