import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

import { books, blogs, courses } from "./Data";

function App() {

  const show = true;

  return (

    <div className="container">

      {show ? (

        <>

          <div className="section">
            <CourseDetails courses={courses} />
          </div>

          <div className="section">
            <BookDetails books={books} />
          </div>

          <div className="section">
            <BlogDetails blogs={blogs} />
          </div>

        </>

      ) : (

        <h2>No Data Available</h2>

      )}

    </div>

  );
}

export default App;