# Dimostrazione del pattern Observer

Dimostrazione dell'utilizzo del pattern comportamentale: Observer.<br/>
L'oggetto <i>Elaboration</i> viene <i>"osservato" <code>Observable</code>)</i> da due
istanze di classi diverse.<br/>Quando lo stato di <i>Elaboration</i> varia, i due
<i>"osservatori" <code>Observer</code></i> elaborano il nuovo stato.
<p>
Abbiamo così un'elaborazione fittizia che ad ogni "step" notifica l'avanzamento.<br/>
Due diversi <code>Observer</code> in "ascolto" elaborano il dato ricevuto e rappresentano l'avanzamento ognuno con la propria notazione (decimale o percentuale).
</p>
<p>
L'output dell'esempio (qui di seguito) mostra l'elaborazione del dato ricevuto dai due <code>Observer</code>:

<pre><code>Step: 1
Progress percent: 0%
Progress decimal: 0/10
Step: 2
Progress percent: 25%
Progress decimal: 2/10
Step: 3
Progress percent: 50%
Progress decimal: 5/10
Step: 4
Progress percent: 75%
Progress decimal: 7/10
Step: 5
Progress percent: 100%
Progress decimal: 10/10
</code></pre>
