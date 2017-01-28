# To deploy
```bash
# With leiningen installed, on a Unix-like system
export gae_project_id=my-project-id
./deploy
```

# To query
```bash
for n in {1..10}; do curl -d "" "http://my-project-id.appspot.com/hello"; done
```
