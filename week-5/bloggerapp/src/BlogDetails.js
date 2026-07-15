import React from "react";

function BlogDetails({ blogs }) {
  return (
    <div>

      <h1>Blog Details</h1>

      {blogs.map((blog) => (

        <div key={blog.id}>

          <h3>{blog.title}</h3>

          <h4>{blog.author}</h4>

          <p>{blog.content}</p>

        </div>

      ))}

    </div>
  );
}

export default BlogDetails;