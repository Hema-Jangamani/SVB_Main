
var allSections = document.querySelectorAll("section");
allSections.forEach((element) => {
  if (element.dataset.id !== "home") {
    element.style.display = "none";
  } else {
    element.style.display = "block";
  }
});

function toggleNav(e) {
  const ID = e.target.dataset.id;
  const allNavs = document.querySelectorAll(".nav li a");
  allNavs.forEach((element) => {
    if (element.dataset.id !== ID) {
      element.classList.remove("active");
    } else {
      element.classList.add("active");
    }
  });

  allSections.forEach((element) => {
    if (element.dataset.id !== ID) {
      element.style.display = "none";
    } else {
      element.style.display = "block";
    }
  });
}

function getData(url) {
  var xmlHttp = new XMLHttpRequest();
  xmlHttp.open("GET", url, false); // false for synchronous request
  xmlHttp.withCredentials = true;
  xmlHttp.send(null);
  console.log(xmlHttp.responseText);
  const obj = JSON.parse(xmlHttp.responseText);
  return obj;
}

function fetchAllMovies() {
  const URL = `http://localhost:8084/security/getAll`;
  const data = getData(URL);
  showTableData(data, "allMovies")


}

function getUserId() {
  const userId = document.getElementById("user");
  const URL = `http://localhost:8084/security/user/${encodeURIComponent(
    userId.value
  )}`;
  const data = getData(URL);
  showTableData(data, "userData")

}

function getRatingsByMovieData() {
  const movieName = document.getElementById("bymovie");
  const URL = `http://localhost:8084/security/movies/${encodeURIComponent(
    movieName.value
  )}`;
  const data = getData(URL);
  showTableData(data.ratings, "ratingsData")

}

function showTableData(data, Id) {
  const tableData = document.getElementById(Id);
  tableData.innerHTML = "";

  switch (Id) {
    case "allMovies":
      for (let key of data) {
        tableData.innerHTML +=
          "<tr><td>" + key.movieId + "</td><td>" + key.name + "</td></tr>";
      }
      break;
    case "userData":
      for (let key of data) {
        tableData.innerHTML +=
          "<tr><td>" + key.movieId + "</td><td>" + key.rating + "</td></tr>";
      }
      break;
    case "ratingsData":
      for (let key of data) {
        tableData.innerHTML +=
          "<tr><td>" + key.userId + "</td><td>" + key.rating + "</td></tr>";
      }
      break;
    default:
  }
}

