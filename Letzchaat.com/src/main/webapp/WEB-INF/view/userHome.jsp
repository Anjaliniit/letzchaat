<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div id="main">
<div id="header">
<%@include file="header.jsp"%>
</div>
<script type="text/javascript">
$(document).ready(function(){
    $('[data-toggle="popover"]').popover();   
});
</script>
<div id="body">
  <aside class="sidebar1">

           <ul>	
               <li>
                    <h4>Notice Board</h4>
                    <ul>
                
                          <li><a href="#" data-toggle="popover" title="About Exam" data-content="You are not eligible for this exam">Vendor Exam<img src="resources/images/new.jpg"/></a></li></li>
                      <li><a href="#" data-toggle="popover" title="About DT Batch" data-content="DT Batch will start from 28/06/16 at 1.30">DT Batch<img src="resources/images/new.jpg"/></a></li></li>
                        
                       <li><a href="#" data-toggle="popover" title="About Java Batch" data-content="Java Batch will start from 28/07/16 at 1.30">Java Batch<img src="resources/images/new.jpg"/></a></li></li>
                          <li><a href="#" data-toggle="popover" title="About C++ Batch" data-content="Contact to Front Office">C++ Batch<img src="resources/images/new.jpg"/></a></li></li>
                          <li><a href="#" data-toggle="popover" title="About C Batch" data-content="Contact to Front Office">C Batch<img src="resources/images/new.jpg"/></a></li></li>
                    </ul>
                </li>
                
             
		
        </aside></div>
        
     





</div>

<div id="footer">
<%@include file="footer.jsp"%>
</div>


</div>


