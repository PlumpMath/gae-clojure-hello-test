## To deploy
```bash
# With leiningen installed, on a Unix-like system
export gae_project_id=my-project-id
./deploy
```

## To query
```bash
for n in {1..50}; do curl -d "" "http://my-project-id.appspot.com/hello"; done
```

## Memory usage
Using the above loop of 50 iterations, here is an example of how the memory
usage of a single instance keeps growing. It starts at 206.8MB and, after each
set of 50 serial requests, grows from around 100KB to 3MB each iteration.

```text
206.8 => 207.1
207.1 => 211.1
211.1 => 211.7
211.7 => 212
212 => 212.3
212.3 => 212.4
212.4 => 212.9
212.9 => 213
```
