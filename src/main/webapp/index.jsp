<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>DEMO</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="cua-hang/index">Cửa Hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="khach-hang/index">Khách Hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href=nhan-vien/index>Nhân Viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="chuc-vu/index">Chức Vụ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="mau-sac/index">Màu Sắc</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">....</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<%--<main class="container">--%>
<%--    <div class="row mb-2">--%>
<%--        <div class="col-md-6">--%>
<%--            <div class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">--%>
<%--                <div class="col p-4 d-flex flex-column position-static">--%>
<%--                    <strong class="d-inline-block mb-2 text-primary-emphasis">World</strong>--%>
<%--                    <h3 class="mb-0">Featured post</h3>--%>
<%--                    <div class="mb-1 text-body-secondary">Nov 12</div>--%>
<%--                    <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to--%>
<%--                        additional content.</p>--%>
<%--                    <a href="#" class="icon-link gap-1 icon-link-hover stretched-link">--%>
<%--                        Continue reading--%>
<%--                        <svg class="bi">--%>
<%--                            <use xlink:href="#chevron-right"></use>--%>
<%--                        </svg>--%>
<%--                    </a>--%>
<%--                </div>--%>
<%--                <div class="col-auto d-none d-lg-block">--%>
<%--                    <svg class="bd-placeholder-img" width="200" height="250" xmlns="http://www.w3.org/2000/svg"--%>
<%--                         role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice"--%>
<%--                         focusable="false"><title>Placeholder</title>--%>
<%--                        <rect width="100%" height="100%" fill="#55595c"></rect>--%>
<%--                        <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>--%>
<%--                    </svg>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="col-md-6">--%>
<%--            <div class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">--%>
<%--                <div class="col p-4 d-flex flex-column position-static">--%>
<%--                    <strong class="d-inline-block mb-2 text-success-emphasis">Design</strong>--%>
<%--                    <h3 class="mb-0">Post title</h3>--%>
<%--                    <div class="mb-1 text-body-secondary">Nov 11</div>--%>
<%--                    <p class="mb-auto">This is a wider card with supporting text below as a natural lead-in to--%>
<%--                        additional content.</p>--%>
<%--                    <a href="#" class="icon-link gap-1 icon-link-hover stretched-link">--%>
<%--                        Continue reading--%>
<%--                        <svg class="bi">--%>
<%--                            <use xlink:href="#chevron-right"></use>--%>
<%--                        </svg>--%>
<%--                    </a>--%>
<%--                </div>--%>
<%--                <div class="col-auto d-none d-lg-block">--%>
<%--                    <svg class="bd-placeholder-img" width="200" height="250" xmlns="http://www.w3.org/2000/svg"--%>
<%--                         role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice"--%>
<%--                         focusable="false"><title>Placeholder</title>--%>
<%--                        <rect width="100%" height="100%" fill="#55595c"></rect>--%>
<%--                        <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>--%>
<%--                    </svg>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>

<%--    <div class="row g-5">--%>
<%--        <div class="col-md-8">--%>
<%--            <h3 class="pb-4 mb-4 fst-italic border-bottom">--%>
<%--                From the Firehose--%>
<%--            </h3>--%>

<%--            <article class="blog-post">--%>
<%--                <h2 class="display-5 link-body-emphasis mb-1">Sample blog post</h2>--%>
<%--                <p class="blog-post-meta">January 1, 2021 by <a href="#">Mark</a></p>--%>

<%--                <p>This blog post shows a few different types of content that’s supported and styled with Bootstrap.--%>
<%--                    Basic typography, lists, tables, images, code, and more are all supported as expected.</p>--%>
<%--                <hr>--%>
<%--                <p>This is some additional paragraph placeholder content. It has been written to fill the available--%>
<%--                    space and show how a longer snippet of text affects the surrounding content. We'll repeat it often--%>
<%--                    to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>--%>
<%--                <h2>Blockquotes</h2>--%>
<%--                <p>This is an example blockquote in action:</p>--%>
<%--                <blockquote class="blockquote">--%>
<%--                    <p>Quoted text goes here.</p>--%>
<%--                </blockquote>--%>
<%--                <p>This is some additional paragraph placeholder content. It has been written to fill the available--%>
<%--                    space and show how a longer snippet of text affects the surrounding content. We'll repeat it often--%>
<%--                    to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>--%>
<%--                <h3>Example lists</h3>--%>
<%--                <p>This is some additional paragraph placeholder content. It's a slightly shorter version of the other--%>
<%--                    highly repetitive body text used throughout. This is an example unordered list:</p>--%>
<%--                <ul>--%>
<%--                    <li>First list item</li>--%>
<%--                    <li>Second list item with a longer description</li>--%>
<%--                    <li>Third list item to close it out</li>--%>
<%--                </ul>--%>
<%--                <p>And this is an ordered list:</p>--%>
<%--                <ol>--%>
<%--                    <li>First list item</li>--%>
<%--                    <li>Second list item with a longer description</li>--%>
<%--                    <li>Third list item to close it out</li>--%>
<%--                </ol>--%>
<%--                <p>And this is a definition list:</p>--%>
<%--                <dl>--%>
<%--                    <dt>HyperText Markup Language (HTML)</dt>--%>
<%--                    <dd>The language used to describe and define the content of a Web page</dd>--%>
<%--                    <dt>Cascading Style Sheets (CSS)</dt>--%>
<%--                    <dd>Used to describe the appearance of Web content</dd>--%>
<%--                    <dt>JavaScript (JS)</dt>--%>
<%--                    <dd>The programming language used to build advanced Web sites and applications</dd>--%>
<%--                </dl>--%>
<%--                <h2>Inline HTML elements</h2>--%>
<%--                <p>HTML defines a long list of available inline tags, a complete list of which can be found on the <a--%>
<%--                        href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element">Mozilla Developer Network</a>.--%>
<%--                </p>--%>
<%--                <ul>--%>
<%--                    <li><strong>To bold text</strong>, use <code class="language-plaintext highlighter-rouge">&lt;strong&gt;</code>.--%>
<%--                    </li>--%>
<%--                    <li><em>To italicize text</em>, use <code--%>
<%--                            class="language-plaintext highlighter-rouge">&lt;em&gt;</code>.--%>
<%--                    </li>--%>
<%--                    <li>Abbreviations, like <abbr title="HyperText Markup Language">HTML</abbr> should use <code--%>
<%--                            class="language-plaintext highlighter-rouge">&lt;abbr&gt;</code>, with an optional <code--%>
<%--                            class="language-plaintext highlighter-rouge">title</code> attribute for the full phrase.--%>
<%--                    </li>--%>
<%--                    <li>Citations, like <cite>— Mark Otto</cite>, should use <code--%>
<%--                            class="language-plaintext highlighter-rouge">&lt;cite&gt;</code>.--%>
<%--                    </li>--%>
<%--                    <li>--%>
<%--                        <del>Deleted</del>--%>
<%--                        text should use <code class="language-plaintext highlighter-rouge">&lt;del&gt;</code> and--%>
<%--                        <ins>inserted</ins>--%>
<%--                        text should use <code class="language-plaintext highlighter-rouge">&lt;ins&gt;</code>.--%>
<%--                    </li>--%>
<%--                    <li>Superscript <sup>text</sup> uses <code--%>
<%--                            class="language-plaintext highlighter-rouge">&lt;sup&gt;</code> and subscript--%>
<%--                        <sub>text</sub> uses <code class="language-plaintext highlighter-rouge">&lt;sub&gt;</code>.--%>
<%--                    </li>--%>
<%--                </ul>--%>
<%--                <p>Most of these elements are styled by browsers with few modifications on our part.</p>--%>
<%--                <h2>Heading</h2>--%>
<%--                <p>This is some additional paragraph placeholder content. It has been written to fill the available--%>
<%--                    space and show how a longer snippet of text affects the surrounding content. We'll repeat it often--%>
<%--                    to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>--%>
<%--                <h3>Sub-heading</h3>--%>
<%--                <p>This is some additional paragraph placeholder content. It has been written to fill the available--%>
<%--                    space and show how a longer snippet of text affects the surrounding content. We'll repeat it often--%>
<%--                    to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>--%>
<%--                <pre><code>Example code block</code></pre>--%>
<%--                <p>This is some additional paragraph placeholder content. It's a slightly shorter version of the other--%>
<%--                    highly repetitive body text used throughout.</p>--%>
<%--            </article>--%>

<%--            <article class="blog-post">--%>
<%--                <h2 class="display-5 link-body-emphasis mb-1">Another blog post</h2>--%>
<%--                <p class="blog-post-meta">December 23, 2020 by <a href="#">Jacob</a></p>--%>

<%--                <p>This is some additional paragraph placeholder content. It has been written to fill the available--%>
<%--                    space and show how a longer snippet of text affects the surrounding content. We'll repeat it often--%>
<%--                    to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>--%>
<%--                <blockquote>--%>
<%--                    <p>Longer quote goes here, maybe with some <strong>emphasized text</strong> in the middle of it.</p>--%>
<%--                </blockquote>--%>
<%--                <p>This is some additional paragraph placeholder content. It has been written to fill the available--%>
<%--                    space and show how a longer snippet of text affects the surrounding content. We'll repeat it often--%>
<%--                    to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>--%>
<%--                <h3>Example table</h3>--%>
<%--                <p>And don't forget about tables in these posts:</p>--%>
<%--                <table class="table">--%>
<%--                    <thead>--%>
<%--                    <tr>--%>
<%--                        <th>Name</th>--%>
<%--                        <th>Upvotes</th>--%>
<%--                        <th>Downvotes</th>--%>
<%--                    </tr>--%>
<%--                    </thead>--%>
<%--                    <tbody>--%>
<%--                    <tr>--%>
<%--                        <td>Alice</td>--%>
<%--                        <td>10</td>--%>
<%--                        <td>11</td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td>Bob</td>--%>
<%--                        <td>4</td>--%>
<%--                        <td>3</td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td>Charlie</td>--%>
<%--                        <td>7</td>--%>
<%--                        <td>9</td>--%>
<%--                    </tr>--%>
<%--                    </tbody>--%>
<%--                    <tfoot>--%>
<%--                    <tr>--%>
<%--                        <td>Totals</td>--%>
<%--                        <td>21</td>--%>
<%--                        <td>23</td>--%>
<%--                    </tr>--%>
<%--                    </tfoot>--%>
<%--                </table>--%>

<%--                <p>This is some additional paragraph placeholder content. It's a slightly shorter version of the other--%>
<%--                    highly repetitive body text used throughout.</p>--%>
<%--            </article>--%>

<%--            <article class="blog-post">--%>
<%--                <h2 class="display-5 link-body-emphasis mb-1">New feature</h2>--%>
<%--                <p class="blog-post-meta">December 14, 2020 by <a href="#">Chris</a></p>--%>

<%--                <p>This is some additional paragraph placeholder content. It has been written to fill the available--%>
<%--                    space and show how a longer snippet of text affects the surrounding content. We'll repeat it often--%>
<%--                    to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>--%>
<%--                <ul>--%>
<%--                    <li>First list item</li>--%>
<%--                    <li>Second list item with a longer description</li>--%>
<%--                    <li>Third list item to close it out</li>--%>
<%--                </ul>--%>
<%--                <p>This is some additional paragraph placeholder content. It's a slightly shorter version of the other--%>
<%--                    highly repetitive body text used throughout.</p>--%>
<%--            </article>--%>

<%--            <nav class="blog-pagination" aria-label="Pagination">--%>
<%--                <a class="btn btn-outline-primary rounded-pill" href="#">Older</a>--%>
<%--                <a class="btn btn-outline-secondary rounded-pill disabled">Newer</a>--%>
<%--            </nav>--%>

<%--        </div>--%>

<%--        <div class="col-md-4">--%>
<%--            <div class="position-sticky" style="top: 2rem;">--%>
<%--                <div class="p-4 mb-3 bg-body-tertiary rounded">--%>
<%--                    <h4 class="fst-italic">About</h4>--%>
<%--                    <p class="mb-0">Customize this section to tell your visitors a little bit about your publication,--%>
<%--                        writers, content, or something else entirely. Totally up to you.</p>--%>
<%--                </div>--%>

<%--                <div>--%>
<%--                    <h4 class="fst-italic">Recent posts</h4>--%>
<%--                    <ul class="list-unstyled">--%>
<%--                        <li>--%>
<%--                            <a class="d-flex flex-column flex-lg-row gap-3 align-items-start align-items-lg-center py-3 link-body-emphasis text-decoration-none border-top"--%>
<%--                               href="#">--%>
<%--                                <svg class="bd-placeholder-img" width="100%" height="96"--%>
<%--                                     xmlns="http://www.w3.org/2000/svg" aria-hidden="true"--%>
<%--                                     preserveAspectRatio="xMidYMid slice" focusable="false">--%>
<%--                                    <rect width="100%" height="100%" fill="#777"></rect>--%>
<%--                                </svg>--%>
<%--                                <div class="col-lg-8">--%>
<%--                                    <h6 class="mb-0">Example blog post title</h6>--%>
<%--                                    <small class="text-body-secondary">January 15, 2023</small>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                        <li>--%>
<%--                            <a class="d-flex flex-column flex-lg-row gap-3 align-items-start align-items-lg-center py-3 link-body-emphasis text-decoration-none border-top"--%>
<%--                               href="#">--%>
<%--                                <svg class="bd-placeholder-img" width="100%" height="96"--%>
<%--                                     xmlns="http://www.w3.org/2000/svg" aria-hidden="true"--%>
<%--                                     preserveAspectRatio="xMidYMid slice" focusable="false">--%>
<%--                                    <rect width="100%" height="100%" fill="#777"></rect>--%>
<%--                                </svg>--%>
<%--                                <div class="col-lg-8">--%>
<%--                                    <h6 class="mb-0">This is another blog post title</h6>--%>
<%--                                    <small class="text-body-secondary">January 14, 2023</small>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                        <li>--%>
<%--                            <a class="d-flex flex-column flex-lg-row gap-3 align-items-start align-items-lg-center py-3 link-body-emphasis text-decoration-none border-top"--%>
<%--                               href="#">--%>
<%--                                <svg class="bd-placeholder-img" width="100%" height="96"--%>
<%--                                     xmlns="http://www.w3.org/2000/svg" aria-hidden="true"--%>
<%--                                     preserveAspectRatio="xMidYMid slice" focusable="false">--%>
<%--                                    <rect width="100%" height="100%" fill="#777"></rect>--%>
<%--                                </svg>--%>
<%--                                <div class="col-lg-8">--%>
<%--                                    <h6 class="mb-0">Longer blog post title: This one has multiple lines!</h6>--%>
<%--                                    <small class="text-body-secondary">January 13, 2023</small>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                    </ul>--%>
<%--                </div>--%>

<%--                <div class="p-4">--%>
<%--                    <h4 class="fst-italic">Archives</h4>--%>
<%--                    <ol class="list-unstyled mb-0">--%>
<%--                        <li><a href="#">March 2021</a></li>--%>
<%--                        <li><a href="#">February 2021</a></li>--%>
<%--                        <li><a href="#">January 2021</a></li>--%>
<%--                        <li><a href="#">December 2020</a></li>--%>
<%--                        <li><a href="#">November 2020</a></li>--%>
<%--                        <li><a href="#">October 2020</a></li>--%>
<%--                        <li><a href="#">September 2020</a></li>--%>
<%--                        <li><a href="#">August 2020</a></li>--%>
<%--                        <li><a href="#">July 2020</a></li>--%>
<%--                        <li><a href="#">June 2020</a></li>--%>
<%--                        <li><a href="#">May 2020</a></li>--%>
<%--                        <li><a href="#">April 2020</a></li>--%>
<%--                    </ol>--%>
<%--                </div>--%>

<%--                <div class="p-4">--%>
<%--                    <h4 class="fst-italic">Elsewhere</h4>--%>
<%--                    <ol class="list-unstyled">--%>
<%--                        <li><a href="#">GitHub</a></li>--%>
<%--                        <li><a href="#">Twitter</a></li>--%>
<%--                        <li><a href="#">Facebook</a></li>--%>
<%--                    </ol>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>

<%--</main>--%>
<%--<div class="container">--%>
<%--    <footer class="row row-cols-1 row-cols-sm-2 row-cols-md-5 py-5 my-5 border-top">--%>
<%--        <div class="col mb-3">--%>
<%--            <a href="/" class="d-flex align-items-center mb-3 link-body-emphasis text-decoration-none">--%>
<%--                <svg class="bi me-2" width="40" height="32">--%>
<%--                    <use xlink:href="#bootstrap"></use>--%>
<%--                </svg>--%>
<%--            </a>--%>
<%--            <p class="text-body-secondary">© 2023</p>--%>
<%--        </div>--%>

<%--        <div class="col mb-3">--%>

<%--        </div>--%>

<%--        <div class="col mb-3">--%>
<%--            <h5>Section</h5>--%>
<%--            <ul class="nav flex-column">--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Home</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Features</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Pricing</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">FAQs</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">About</a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>

<%--        <div class="col mb-3">--%>
<%--            <h5>Section</h5>--%>
<%--            <ul class="nav flex-column">--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Home</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Features</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Pricing</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">FAQs</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">About</a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>

<%--        <div class="col mb-3">--%>
<%--            <h5>Section</h5>--%>
<%--            <ul class="nav flex-column">--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Home</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Features</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">Pricing</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">FAQs</a></li>--%>
<%--                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-body-secondary">About</a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--    </footer>--%>
<%--</div>--%>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
        crossorigin="anonymous"></script>
</body>
</html>