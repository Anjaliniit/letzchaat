<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@include file="header.jsp"%>
<!-- carousel section -->
<div class="container-fluid">
   <div id="myCarousel1" class="carousel slide" style="max-width: 100%; margin: 0 auto">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel1" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel1" data-slide-to="1"></li>
        <li data-target="#myCarousel1" data-slide-to="2"></li>
        <li data-target="#myCarousel1" data-slide-to="3"></li>
        <li data-target="#myCarousel1" data-slide-to="4"></li>
      </ol>
      <div class="carousel-inner">
        <div class="item">
          <img class="img-responsive center-block" src="${imgloc}NIIT-DT-banner.jpg" alt="First carousel Image">
       </div>
        <div class="item">
          <img class="img-responsive center-block" src="${imgloc}NIIT-GNIIT-banner.jpg"    alt="Second carousel Image">
          </div>
        <div class="item  active">
          <img class="img-responsive center-block" src="${imgloc}niit-tc-banner.JPG"    alt="Third carousel Image">
         </div>
		 <div class="item">
          <img class="img-responsive center-block" src="${imgloc}New-Generic-Web-Banner-NIIT.JPG"    alt="Fourth carousel Image">
         </div>
          <div class="item">
          <img class="img-responsive center-block" src="${imgloc}school-solutions.jpg"    alt="Fourth carousel Image">
         </div>
   
   </div>
      <a class="left carousel-control" href="#myCarousel1" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel1" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
    </div>
        </div>
        <!--carousel end here -->
   
<p></p>


<!-- Container (bulletin Section) -->
<div id="bulletin" class="container-fluid text-center bg-grey">
  <h2>BULLETIN</h2><br>
  <h4>What we have created</h4>
  <div class="row text-center slideanim">
  
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="${imgloc}meanstack.png" alt="San Francisco" width="400" height="300">
        <p><strong>NIIT launches course in Web App Development with MEAN Stack under Digital Transformation series</strong></p>
        <p>MongoDB, Express.js, AngularJS, Node.js (MEAN) represents a group of open source technologies which are known to synergize well together, thereby empowering students to launch their own web and mobile apps.</p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="${imgloc}scholarship.jpg" alt="Paris" width="400" height="300">
        <p><strong>NIIT announces 17th National Scholarship in Nigeria</strong></p>
        <p>Yes, we built Paris</p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="newyork.jpg" alt="New York" width="400" height="300">
        <p><strong>NIIT announces the launch of the first Interactive Live Online course in Digital Marketing</strong></p>
        <p>We built New York</p>
      </div>
    </div>
  </div><br>
  
  <div id="aboutus" class="container-fluid about">
  <div class="row">
    <div class="col-sm-9">
      <h2>About Company Page</h2><br>
      <h4>Established in 1981, NIIT Limited, a global leader in Skills and Talent Development, offers multi-disciplinary learning management and training delivery solutions to corporations, institutions, and individuals in over 40 countries. It has become known, in particular, as a corporate training company and Industrial Training Company, with customized programs for both large and small enterprises.</h4>
<p>
NIIT has three main lines of business across the globe-Corporate Learning Group, Skills and Careers Group, and the School Learning Group.
      NIIT's Corporate Learning Group (CLG) has established NIIT as a leading Corporate Training company which offers Managed Training Services (MTS) to market-leading organizations in North America, Europe, Asia, and Oceania.
     NIIT's Skills and Careers Group (SCG) delivers a diverse range of learning and talent development programs to millions of individuals and corporate learners in areas including Banking, Finance & Insurance, Soft Skills, Business Analytics, Retail Sales Enablement, Management Education, Vocational Skills, Digital Media Marketing and new-age IT.
       NIIT's School Learning Group (SLG) provides technology based learning to over 15,000 government and private schools in India, Bhutan, South Africa and the Middle East. The futuristic NIIT nGuru range of learning solutions for schools comprises Interactive Classrooms with digital content, technology-driven Math Lab, IT Wizard programs and Quick School-an Education Resource Planning software.</p>
      <br><button class="btn btn-default btn-lg">Get in Touch</button>
    </div>
    <div class="col-sm-3">
      <span class="glyphicon glyphicon-signal logo"></span>
    </div>
  </div>
</div>
-->

  
  
  
  
  
  <h2>What our customers say</h2>
  <div id="myCarousel" class="carousel slide text-center" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarouse" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <h4>"This company is the best. I am so happy with the result!"<br><span style="font-style:normal;">Michael Roe, Vice President, Comment Box</span></h4>
      </div>
      <div class="item">
        <h4>"One word... WOW!!"<br><span style="font-style:normal;">John Doe, Salesman, Rep Inc</span></h4>
      </div>
      <div class="item">
        <h4>"Could I... BE any more happy with this company?"<br><span style="font-style:normal;">Chandler Bing, Actor, FriendsAlot</span></h4>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<%@include file="footer.jsp"%>










