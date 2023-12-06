<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href="/ihrms/css/bootstrap.min.css" rel="stylesheet">
    <link href="/ihrms/css/font-awesome.min.css" rel="stylesheet">
    <link href="/ihrms/css/style.css" rel="stylesheet">

    <title>Login Page</title>
  </head>
  <body>
  <form action="login" method="post">
    <section class="_form_05">
      <div class="container">
        <div class="row">
          <div class="col-12">
            <div class="_form-05-box">
              <div class="row">
                <div class="col-sm-5 _lk_nb">
                  <div class="form-05-box-a">
                    <div class="_form_05_logo">
                      <h2>CDAC HRMS</h2>
                      <p>Login using social media to get quick access</p>
                    </div>
                  </div>
                </div>
                <div class="col-sm-7 _nb-pl">
                  <div class="_mn_df">
                    <div class="main-head">
                      <h2>Login to your account</h2>
                    </div>
                    <div class="form-group">
                      <input id="username" name="username" type="text" name="username" class="form-control" type="text" placeholder="Enter Username" required="" aria-required="true">
                    </div>
                    <div class="form-group">
                      <input id="password" name="password" type="password" name="password" class="form-control" type="text" placeholder="Enter Password" required="" aria-required="true">
                    </div>
                    <div class="checkbox form-group">
                    <div class="form-group">
                      <button type="submit" class="btn btn-success btn-lg">Login</button>
                    </div>
                      <a href="#">Forgot Password</a>
                    </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    </form>
  </body>
</html>