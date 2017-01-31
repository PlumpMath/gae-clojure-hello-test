## To deploy
```bash
# With maven installed
cd myapp
# replace XXX in pom.xml with app id
mvn appengine:update
```

## To query
```bash
for n in {1..50}; do curl -d "" "http://my-project-id.appspot.com/hello"; done
```

## Memory usage
Using the above loop of 50 iterations, here is an example of how the memory
usage of a single instance keeps growing. It starts anywhere between 135MB and
203MB and, after each set of 50 serial requests, grows from around 100KB to
700KB each iteration.

```text
# First try
143.3 => 143.6
143.6 => 144
144 => 144.1
144.1 => 145.5
145.5 => 145.6


# Second try
140 => 141.1
141.1 => 141.6
141.6 => 142.3
```

The starting memory usage is, just like with Clojure, very inconsistent, too.
The first instances that came up after some concurrent requests (memory usage in
MB):

```text
143.3
135
199.6
140
202.4
208.7
135.2
131.6
141
136.5
182.8
456.7
188.5
```
