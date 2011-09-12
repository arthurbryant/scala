val filesHere = new java.io.File("/root").listFiles
def queryMatching(matcher: (String) => Boolean)
{
	for(file <- filesHere; if matcher(file.getName))
		println(file.getName)
}
def queryEndWith(query: String) = queryMatching(_.endsWith(query))
def queryContain(query: String) = queryMatching(_.contains(query))
def queryRegex(query: String) = queryMatching(_.matches(query))
queryEndWith("log")
println("-----------------")
queryContain("BACK")
println("-----------------")
queryRegex(".*client.*")

