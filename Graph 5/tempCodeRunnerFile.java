if(curr.dist+wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.dist + wt;
                    pq.add(new Pair(v,dist[v],curr.stops+1));
                }